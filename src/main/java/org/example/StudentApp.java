package org.example;


public class StudentApp {
    public static void main(String[] args){
        //Prompt user for details
        Student firstStudent = new Student();
        firstStudent.setName("");
        firstStudent.setEmail("");
        firstStudent.setCourse("");

        System.out.println("Details are "+ firstStudent.toString());

        Student secondStudent = new Student("bill");

        Student thirdStudent = new Student("joe", "joe.123", "civil");
    }

}