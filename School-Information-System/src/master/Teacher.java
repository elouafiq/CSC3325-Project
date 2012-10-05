package master;

import java.util.GregorianCalendar;

public class Teacher extends Employee {

	private GregorianCalendar dateOfHire;
	//private Schedule schedule;

	public Teacher (){
		super();
	}

	public Teacher(String firstName, String lastName, String address,
			GregorianCalendar birthdate, String phoneNumber, GregorianCalendar dateOfHire,
			int hoursWorked, double salary) {
		super(firstName, lastName, address, birthdate, phoneNumber, hoursWorked, salary);
		this.dateOfHire = dateOfHire;
		//setSchedule(new Schedule());
	}

	public GregorianCalendar getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(GregorianCalendar dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	//public void setSchedule(Schedule schedule) {
		//this.schedule = schedule;
	//}

	//public Schedule getSchedule() {
		//return schedule;
	//}


}
