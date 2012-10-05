package database;

import java.util.Vector;
import database.exceptions.*;

public class Section  implements java.io.Serializable {
	public static int capacity = 20;

	private String id;
	private Vector listOfStudent;
	private Vector listOfTeachers;
	private int roomNumber;
	private String[][] schedule;

	public Section(String id, int roomNumber){
		schedule = new String[5][8];
		listOfStudent = new Vector ();
		listOfTeachers = new Vector ();
		this.id = id;
		this.roomNumber = roomNumber;
	}

	public void setListOfTeachers(Vector listOfTeachers) {
		this.listOfTeachers = listOfTeachers;
	}

	public String[][] getSchedule() {
		return schedule;
	}

	public void setSchedule(String[][] schedule) {
		this.schedule = schedule;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static int getCapacity() {
		return capacity;
	}

	public static void setCapacity(int capacity) {
		Section.capacity = capacity;
	}

	public Vector getListOfStudent() {
		return listOfStudent;
	}

	public void setListOfStudent(Vector listOfStudent) {
		this.listOfStudent = listOfStudent;
	}

	public Vector getListOfTeachers() {
		return listOfTeachers;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String toString(){
		return new String("section " + id);
	}

	public int searchStudent(Student student){
		for (int i = 0; i < listOfStudent.size(); i++)
			if (listOfStudent.get(i).equals(student))
				return i;
		return -1;
	}

	public void enrollStudent(Student student) throws FullSectionException,
										StudentAlreadyEnrolledException {
		if (listOfStudent.size() >= capacity)
			throw new FullSectionException(new String(this + "is full."));
		int foundStudent = searchStudent(student);
		if (foundStudent != -1)
			throw new StudentAlreadyEnrolledException(new String(student + "is already enrolled."));
		listOfStudent.add(student);
	}

	public void removeStudent(Student student) throws StudentNotFoundInSectionException, EmptySectionException {
		if (listOfStudent.size() == 0)
			throw new EmptySectionException(new String(this + " is empty"));
		int foundStudent = searchStudent(student);
		if (foundStudent == -1 )
			throw new StudentNotFoundInSectionException(new String(student + "Cannot be found."));
		listOfStudent.remove(foundStudent);
	}

	/*
	 * When Implementing the Gui, 0 means monday
	 * 1 means tuesday... 4 means friday
	 */
	public void addTimeSlot(int day, int begin, int end){
		for (int i = begin; i < end; i++)
			schedule[day][i] = id;
	}

	public boolean conflicts(String schedule[][]){
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 8; j++)
				if (this.schedule[i][j] == schedule[i][j])
					return true;
		return false;
	}

}
