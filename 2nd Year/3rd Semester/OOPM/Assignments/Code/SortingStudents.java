//Write a Java Program to sort the list of students on the basis of their marks.

package com.byGaurav.assign1;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author Gaurav Amarnani.
 */

public class SortingStudents {

    private static Student[] listOfStudents;

    public static void main(String...args) {
        takeStudentsDetails();
        sortStudents();
        printList();
    }

    public static void takeStudentsDetails() {
        Scanner scanner = new Scanner(in);
        out.println("Enter the number of Student whose details you want to add:");
        Integer number = scanner.nextInt();
        listOfStudents = new Student[number];
        for(int i = 0; i < number; i++) {
            out.println("Enter Student Name: ");
            String name = scanner.next();
            out.println("Enter Student Marks: ");
            Integer marks = scanner.nextInt();
            listOfStudents[i] = new Student(name, marks);
        }
        scanner.close();
    }

    public static void sortStudents() {
        Student temp = new Student();
        for (int i = 0; i < listOfStudents.length; i++) {
            for (int j = i + 1; j < listOfStudents.length; j++) {
                if (listOfStudents[i].getMarks() > listOfStudents[j].getMarks()) {
                    temp = listOfStudents[i];
                    listOfStudents[i] = listOfStudents[j];
                    listOfStudents[j] = temp;
                }
            }
        }
    }

    public static void printList() {
        out.println("Student List: ");
        for(int i = 0; i < listOfStudents.length; i++)
            out.println(listOfStudents[i]);
    }
}

class Student {

    private String name;
    private Integer marks;

    Student() { }

    Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public Integer getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "\nName = " + name + ", Marks = " + marks + ".\n";
    }
}