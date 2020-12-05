package com.wsu.cs;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 * Represents a Student Wait List
 * @author Jim Spisto
 * @version 2
 * @date 10/07/2020
 */


public class WaitListRoster {
    private LinkedList<Student> waitListRoster = new LinkedList<>();
    ListIterator<Student> waitListIterator;

    /**
     * Returns Wait List
     * @return waitListRoster
     */
    public LinkedList getWaitList() {
        return waitListRoster;
    }

    /**
     * Adds Student Objects to Wait List
     * @param myStudent, Student Object to be added
     */
    public void addStudentToWaitList(Student myStudent) {
        waitListRoster.add(myStudent);
    }

    /**
     * Returns first Student Object on the Wait List
     * @return
     */

    public Student getFirstStudent() {
        return waitListRoster.getFirst();
    }

    /**
     * Returns the size of the Wait List
     * @return int, size of Wait List, LinkedList
     */

    public int getWaitListSize() {
        return waitListRoster.size();
    }

    /**
     * Checks if the Wait List LinkedList has Student Objects in it
     * @return boolean, returns true if waitListRoster has a size that is not zero
     */

    public boolean WaitListHasSize(){
        if(waitListRoster.size()!=0){
            return true;
        }
        return false;
    }

    /**
     * Checks if a Student Object is in the Wait List via Student ID
     * Returns true is on the Wait List
     * @param studentID, integer used to Find Students via Student ID
     * @return boolean
     */

    public boolean findStudentFromWaitList(int studentID) {
        for (Student s : waitListRoster) {
            if (s.getStudentID() == studentID)
                return true;
        }
        return false;
    }

    /**
     * Prints a Student Object, with the Student ID of user Supplied int
     * @param num, int used to search for Students via Student ID
     */
    public void printFoundWaitList(int num) {
        for (Student s : waitListRoster) {
            if (s.getStudentID() == num)
                System.out.println(s);
        }
    }

    /**
     * Finds, and Drops Students Objects from Wait List
     * @param studentID, int used to find Students using Student ID
     */

    public void dropStudentFromWaitList(int studentID) {
        waitListIterator = waitListRoster.listIterator();
        while (waitListIterator.hasNext()) {
            if (studentID == waitListIterator.next().getStudentID()) {
                waitListIterator.remove();
            }

        }

        System.out.println("Student with ID: " + studentID + " Has been Dropped");
    }
}

