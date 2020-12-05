package com.wsu.cs;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Gets User Information for ClassRoster and WaitListRoster methods
 * @author Jim Spisto
 * @version 2
 * @date 10/07/2020
 */


public class StudentRoster {

    ClassRoster myRoster = new ClassRoster();
    WaitListRoster studentWaitList = new WaitListRoster();

    /**
     * Gets user information and creates a Student Object
     * Moves the Student Objects to the Class Roster, and wait list
     * @param in, the Scanner to read from.
     */

    public void addStudent(Scanner in)

        {
            System.out.println("Enter Student ID");
            String tempID= in.nextLine();
            int userStudentID= Integer.parseInt(tempID);
            System.out.println("Enter Student First Name");
            String userFirstName= in.nextLine();
            System.out.println("Enter Student Last Name");
            String userLastName = in.nextLine();
            System.out.println("Enter Year: (Freshmen, Sophomore, Junior, Senior)");
            String userYear= in.nextLine();
            Student userStudent = new Student(userStudentID,userFirstName,userLastName,userYear);
            myRoster.addStudentToList(userStudent);
            myRoster.moveStudentsToWaitList();
            }
        /**
         * Prints whether Student Object is in Class Roster or is on Wait List.
         * @param in the Scanner to read from.
         */

        public void findStudent(Scanner in)
        {
            System.out.println("Enter Student ID to find");
            int userID = in.nextInt();
           myRoster.printUserStudents(userID);

            }


    /**
     * Takes a user int and calls the drop student methods
     * in the StudentRoster class
     * @param in
     */

        public void dropStudent(Scanner in)
        {
            System.out.println("Enter Student ID to Drop");
            int userID = in.nextInt();
            //studentWaitList.dropStudentFromWaitList(userID);
            myRoster.dropStudentFromList(userID);

        }

    /**
     *Prints Students in the Class list and Wait List
     */

    public void printAllStudents() {
            myRoster.printLists();
       }

        //Driver
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            StudentRoster sr = new StudentRoster();

           System.out.println("Welcome to the CS Student Roster");
           System.out.println("--------------------------------");

            boolean done = false;
            while (!done)
            {
                System.out.print("Students in Course: (F)ind, (A)dd, (D)rop, (P)rint, or (Q)uit: ");
                String choice = in.next();
                if (choice.equals("F") || choice.equals("f"))
                {
                    sr.findStudent(new Scanner(System.in));
                }
                else if (choice.equals("A") || choice.equals("a"))
                {
                    sr.addStudent(new Scanner(System.in));
                }
                else if (choice.equals("D") || choice.equals("d"))
                {
                    sr.dropStudent(new Scanner(System.in));
                }
                else if (choice.equals("P") || choice.equals("p"))
                {
                    sr.printAllStudents();
                }
                done = choice.equals("Q") || choice.equals("q");
            }
            System.out.println("Good bye.  Have a nice day!");
            in.close();
        }

}
