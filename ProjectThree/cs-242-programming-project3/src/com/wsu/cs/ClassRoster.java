package com.wsu.cs;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Represents a Student Roster
 * @author Jim Spisto
 * @version 2
 * @date 10/07/2020
 */


public class ClassRoster {

    WaitListRoster myWaitList = new WaitListRoster();
    private LinkedList<Student> classRoster = new LinkedList<Student>(); 
    private LinkedList<Student> studentWaitList = new LinkedList();
    ListIterator<Student> classRosterIterator;

    /**
     * Prints Student Objects in the Class Roster, and Wait List
     */
    public void printLists() {
        System.out.println("===================");
        System.out.println("Class Roster CS248:");
        System.out.println("===================");
        for (Student s : classRoster) {
            System.out.println(s);

        }
        System.out.println("");
        System.out.println("===================");
        System.out.println("Wait List CS248:");
        System.out.println("===================");
        for (Object w : myWaitList.getWaitList()) {
            System.out.println(w);
        }
    }

    /**
     * Prints the student with the user entered Student ID0
     *
     * @param num, user entered Student ID
     */

    public boolean findStudentFromList(int num) {
        for (Student s : classRoster) {
            if (s.getStudentID() == num)
                return true;
        }
        return false;

    }

    /**
     * Prints a message informing the user if a Student is on the Wait list, or class list
     * @param num, int used to find Student Objects via Student ID
     */
    public void printUserStudents(int num){
        if(findStudentFromList(num))
            System.out.println("Student is on the Class Roster");
        else if(myWaitList.findStudentFromWaitList(num))
            System.out.println("Student is on the Wait List");
        else
            System.out.println("Student not Found");
    }


    /**
     * Returns the classRoster LinkedList
     * @return classRoster
     */
    public LinkedList getList() {
        return classRoster;
    }

    /**
     * Adds a Student Object to the classRoster LinkedList
     * * @param myStudent, Student Object
     */
    public void addStudentToList(Student myStudent) {
        classRoster.add(myStudent);
    }

    /**
     * Moves Students from Wait List to Class Roster
     * @param userID, int used to access Student Objects via Student ID
     */

    public void dropStudentFromList(int userID) {
        classRosterIterator = classRoster.listIterator();
        while (classRosterIterator.hasNext()) {
            if (userID == classRosterIterator.next().getStudentID())
                classRosterIterator.remove();
        }
          if (myWaitList.getWaitList().size()!=0 && classRoster.size() < 5){
               classRoster.add(myWaitList.getFirstStudent());
               myWaitList.getWaitList().removeFirst();
           }

        myWaitList.dropStudentFromWaitList(userID); }


        /**
         * Removes a student from the class roster
         *And adds them to the waitlist, when class roster is full
         */
        public void moveStudentsToWaitList () {
            classRosterIterator = classRoster.listIterator();
            while (classRosterIterator.hasNext()) {
                if (classRoster.indexOf(classRosterIterator.next()) > 4) {
                myWaitList.addStudentToWaitList(classRosterIterator.previous());
                classRosterIterator.remove();
            }
          }
        }
    }


