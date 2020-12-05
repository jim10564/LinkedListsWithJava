package com.wsu.cs;


public class Student {
    private int studentID;    // student ID
    private String firstName;  // first name
    private String lastName;   // last name
    private String year;    //Year - Freshmen, Sophomore, Junior, Senior

    // Student class constructor
    public Student(int studentID, String firstName, String lastName, String year) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return studentID + " " + firstName + " " + lastName + " " + year;
    }
}
