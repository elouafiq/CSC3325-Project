package database;

import java.util.GregorianCalendar;


public class Student extends Person  implements java.io.Serializable{
        private int id;
        private boolean sexe;

        public Student(){
                super();
                id = 0;
                sexe = true; // male
        }

        public Student(int id, String firstName, String lastName, String address,
                        GregorianCalendar birthdate, String phoneNumber){
                super(firstName, lastName, address, birthdate, phoneNumber);
                this.id = id;
        }

        public String getSexe(){
          if (sexe)
            return "Male";
          return "female";
        }

        public void setSexe(boolean sexe){
          this.sexe = sexe;
        }

        public int getId(){
                return id;
        }

        public void setId(int id){
                this.id = id;
        }

        public boolean equals(Student student){
                return (id == student.getId());
        }
}
