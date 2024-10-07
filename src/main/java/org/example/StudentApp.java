package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Prompt user for details
        Student firstStudent = new Student();
        firstStudent.setName("");
        firstStudent.setEmail("");
        firstStudent.setCourse("");

        System.out.println("Details are " + firstStudent.toString());
        System.out.println("Enter name");

        String name = scan.next();

        Student secondStudent = new Student(name);
        System.out.println("Details are " + secondStudent.toString());

        System.out.println("Enter Name: ");
        name = scan.next();
        System.out.println("Enter Email: ");
        String Email = scan.next();
        System.out.println("Enter Course: ");
        String Course = scan.next();
        Student thirdStudent = new Student(name, Email, Course);
        System.out.println("Details are " + thirdStudent.toString());



    }

}