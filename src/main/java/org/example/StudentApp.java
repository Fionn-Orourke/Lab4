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

        //System.out.println("Details are " + firstStudent.toString());
        //System.out.println("Enter name");

        String name = "";

        //Student secondStudent = new Student(name);
        //System.out.println("Details are " + secondStudent.toString());
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> courses = new ArrayList<>();

        ArrayList<Student> students = new ArrayList<>();

        int i = 0;
        for(i = 0; i <3; i++) {
            System.out.println("Enter student"+ i+1 + "Name: ");
            names.add(scan.next());
            System.out.println("Enter student"+ i+1 + "Email: ");
            emails.add(scan.next());
            System.out.println("Enterstudent"+ i+1 + " Course: ");
            courses.add(scan.next());
            students.add(new Student(names.get(i), emails.get(i), courses.get(i)));

        }
        System.out.println(students);

    }

}