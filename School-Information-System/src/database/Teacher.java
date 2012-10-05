package database;

import java.util.GregorianCalendar;

public class Teacher extends Employee  implements java.io.Serializable{

	private GregorianCalendar dateOfHire;
	private String[][] schedule;

	public Teacher(){
		super();
	}

	public Teacher(String firstName, String lastName, String address,
			GregorianCalendar birthdate, String phoneNumber, GregorianCalendar dateOfHire,
			int hoursWorked, double salary) {
		super(firstName, lastName, address, birthdate, phoneNumber, hoursWorked, salary);
		this.dateOfHire = dateOfHire;
		setSchedule(new String[5][8]);
	}

	public GregorianCalendar getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(GregorianCalendar dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public void setSchedule(String[][] schedule) {
		this.schedule = schedule;
	}

	public String[][] getSchedule() {
		return schedule;
	}


}
