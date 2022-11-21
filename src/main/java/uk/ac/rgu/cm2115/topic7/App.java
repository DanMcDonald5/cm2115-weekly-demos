package uk.ac.rgu.cm2115.topic7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args){
        Person person1 = new Person("Parker", "Peter", 17);
        Person person2 = new Person("Rodgers", "Steve", 100);
        Person person3 = new Person("Banner", "Bruce", 53);
        Person person4 = new Person("Morales", "Miles", 17);

        /*List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);


        Map<String,Person> myMap = new HashMap<>();
        
        myMap.put("Spider-Man", person1);
        myMap.put("Captain America", person2);
        myMap.put("Hulk", person3);
        myMap.put("Spider-Man", person4);


        for(String key : myMap.keySet()){
            Person p = myMap.get(key);
            System.out.println(key + ": " + p.getFirstname() + ""+  p.getSurname());
            //System.out.println(key);

            Map<String, List<Person>> myMap2 = new HashMap<>();
            List<Person> people = new ArrayList<>();
            people.add(person1);*/

            List<Person> people3 = new ArrayList<>();

            people3.add(person2);
            people3.add(person4);
            people3.add(person3);
            people3.add(person1);

            people3.sort(new Person.PersonComparator());

            //Collections.sort(people3);

            for(Person p : people3){
                System.out.println(p.getSurname() + " " + p.getFirstname() + " " + p.getAge());
            }

           // people3.forEach(System.out :: println);


           
               List<Person> people4 = people3.stream().filter((Person) -> Person.getAge() > 17).collect((Collectors.toList()));

                people4.forEach(System.out::println);

                for(Person p : people4){
                    System.out.println(p.getSurname() + " " + p.getFirstname() + " " + p.getAge());
                }

         }
    }

