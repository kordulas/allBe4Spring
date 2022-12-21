package com.company;

public class University {

    public static void main(String[] args) {

        Student student = new Student("Jakub","Kordulas", 13412);
        Student student1 = new Student("Michał","Biały", 134122);
        Student student2 = new Student("Jan","Nowak", 176122);

        System.out.println(Student.numberOfStudents);

        String b = "\u2122";

        System.out.println(b);
    }
}
