package com.company;

public class Student {

    String name;
    String lastName;
    int indexNumber;
    public static int numberOfStudents = 0;

    public Student(String name, String lastName, int indexNumber) {
        this.name = name;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        numberOfStudents ++;

    }
}
