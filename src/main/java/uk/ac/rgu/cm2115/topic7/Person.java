package uk.ac.rgu.cm2115.topic7;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    private String surname, firstname;
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person(String surname, String firstname, int age) {
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
    }
    @Override
    public int compareTo(Person o) {
        String otherSurname = o.surname;

        int position = this.surname.compareTo(otherSurname);

        if(position < 0){
            return -1;

        }else if (position == 0){
            return 0;
        }else{
            return 1;
        }


    }

    public static class PersonComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            

            if(o1.age < o2.age){
                return -1;
            }else if(o1.age == o2.age){
                return 0;
            }else {
                return 1;
            }
        }

    }
    

}
