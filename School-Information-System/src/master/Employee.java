package master;

import java.util.GregorianCalendar;


public class Employee extends Person {
	protected int hoursWorked;
	protected double salary;

	public Employee (){
		super();
	}

	public Employee(String firstName, String lastName, String address,
			GregorianCalendar birthdate, String phoneNumber, int hoursWorked,
			double salary) {
		super(firstName, lastName, address, birthdate, phoneNumber);
		this.hoursWorked = hoursWorked;
		this.salary = salary;
	}

	public int getHousWorked() {
		return hoursWorked;
	}

	public void setHousWorked(int housWorked) {
		this.hoursWorked = housWorked;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



}
