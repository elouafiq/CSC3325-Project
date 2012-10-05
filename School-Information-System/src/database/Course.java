package database;

import database.Teacher;

public class Course  implements java.io.Serializable{
	private String name;
	private String id;
	private Teacher teacher;

	public Course(String name, String id) {
		this.name = name;
		this.id = id;
		teacher = new Teacher();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
