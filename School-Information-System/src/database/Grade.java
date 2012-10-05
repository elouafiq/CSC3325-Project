package database;

public class Grade  implements java.io.Serializable{
	private String courseName;
	private double grade;
	private String perfessorName;
	private String comment;

	public Grade(String courseName, double grade, String perfessorName,
			String comment) {
		super();
		this.courseName = courseName;
		this.grade = grade;
		this.perfessorName = perfessorName;
		this.comment = comment;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getPerfessorName() {
		return perfessorName;
	}
	public void setPerfessorName(String perfessorName) {
		this.perfessorName = perfessorName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
