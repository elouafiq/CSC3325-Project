package database;

import java.util.LinkedList;
import database.exceptions.VehicleFullException;
import database.Student;
import java.util.GregorianCalendar;;

public class Vehicle  implements java.io.Serializable{
	public static final int maxOfStudents = 30;

        public String matricule;
	public String driver;
	public String brand;
	public String area;
        public GregorianCalendar date;

	public Vehicle(String licencePlate){
	}



}
