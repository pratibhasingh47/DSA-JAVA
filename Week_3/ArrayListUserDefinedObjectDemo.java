package Week_3;

import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printData() {
        System.out.println(name + " " + age);
    }
}

public class ArrayListUserDefinedObjectDemo {
    public static void main(String[] args) {
        // Declaring pList as a collection of type Person with an initial capacity of 5
        ArrayList<Person> pList = new ArrayList<>(5);

        // Adding Person objects to the list
        pList.add(new Person("Ram", 25));
        Person p2 = new Person("Sita", 22);
        pList.add(p2);
        pList.add(new Person("John", 34));
        pList.add(p2); // Duplicate entry is allowed
        pList.add(new Person("Rahim", 29));
        pList.add(new Person("Lilly", 24)); // No issue to accommodate, list grows dynamically

        // Accessing and printing data for each Person object
        pList.forEach(Person::printData);
    }
}
