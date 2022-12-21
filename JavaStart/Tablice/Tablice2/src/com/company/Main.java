package com.company;

public class Main {

    public static void main(String[] args) {

    Person person1 = new Person(1, 60);
    Person person2 = new Person(2, 115);
    Person person3 = new Person(3, 180);
    Person person4 = new Person(4, 120);
    Person person5 = new Person(5, 70);

    Elevator elevator = new Elevator();
    elevator.addPerson(person1);
    elevator.addPerson(person2);
    elevator.addPerson(person3);
    elevator.addPerson(person4);
    elevator.addPerson(person5);

    elevator.opróżnijWinde();

    elevator.addPerson(person2);
    elevator.addPerson(person3);
    elevator.addPerson(person4);
    elevator.start();
    elevator.opróżnijWinde();

    elevator.addPerson(person1);
    elevator.addPerson(person2);
    elevator.start();
    }
}
