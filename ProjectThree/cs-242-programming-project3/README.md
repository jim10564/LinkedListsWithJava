## CS242 – Fall 2020

# Programming Project 3 – Linked Lists in Java

# Objective

The objective of this Programming Project is to apply the concepts of Linked Lists in Java.  

### Program Description

Implement a project to manage two lists as Linked lists of the students' class roster. One  list represents the students who are are registered in the class and hence are on the class roster. The other list should represent the students who could not get into course and hence are on the Wait-list of the course. 

**Conditions for adding students on to both the lists:**

For this project, you may assume the linked list size of Class Roster as 5. When the Class Roster linked list size is full, next student to be added is to be added on the Wait-list Linked List. The student gets added at the end of the Wait-list Linked List.

**Condition for dropping a student:**

There should be menu options that allow students to be dropped out of any of the two lists. If the student drops out of Class Roster linked list, then the first element on Wait-list linked list should be removed and added to the Class Roster linked list. If the student drops out of the Wait-list linked list, then simply remove that student from the Wait-list linked list. (Search is done with the Student ID.)



**You must write following methods for following menu options:**

• Find a Student

• Add a Student

• Drop a Student

• Print all Students (Both Class Roster and on Wait-List)

• Quit



A skeleton  program is given to you. This file has a main method. and Student class.
All of your java files should be inside **package com.wsu.cs** which is inside **src** subfolder, of your project

If you use **IntelliJ IDE**,  it will set up this way automatically for you.

**This project is intended to be done as an individual.**



### Deliverable

In order to submit your program, you will have to:

1. Fork Programming Project3 from [https://gitlab.com/worcester/cs/cs-242-01-02-03-fall-2020/cs-242-programming-project3](https://gitlab.com/worcester/cs/cs-242-01-02-03-fall-2020/cs-242-programming-project3) to your namespace.

2. Clone it to your local repository.

3. Commit and Push your  final repository to GitLab.

4. Make sure that you add the Instructor (snagpal) as the *Maintainer / Developer*.

### Due Date

Friday, October 9, 2020, End of Day.

## Copyright and License

#### &copy; 2020 S Nagpal, Worcester State University



<img src="http://mirrors.creativecommons.org/presskit/buttons/88x31/png/by-sa.png" width=100px/>This work is licensed under the Creative Commons Attribution-ShareAlike 4.0 International License. To view a copy of this license, visit [http://creativecommons.org/licenses/by-sa/4.0/]() or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
