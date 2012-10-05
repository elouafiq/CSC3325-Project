package database;

import java.util.GregorianCalendar;

public class Person  implements java.io.Serializable{
        private String firstName;
        private String lastName;
        private String address;
        private GregorianCalendar birthdate;
        private String phoneNumber;

        public Person(){

        }

        public Person(String firstName, String lastName, String address,
                        GregorianCalendar birthdate, String phoneNumber) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.address = address;
                this.birthdate = birthdate;
                this.phoneNumber = phoneNumber;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public GregorianCalendar getBirthdate() {
                return birthdate;
        }

        public void setBirthdate(GregorianCalendar birthdate) {
                this.birthdate = birthdate;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public boolean equals(Person person){
                return (person.getLastName().equalsIgnoreCase(lastName));
        }

        public String toString(){
                return new String(firstName + " " + lastName);
        }

}
