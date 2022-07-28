package edu.ilstu;
/**
 * Created 11/11/2021
 * 
 * ULIDs: gpnewco and tkenda2
 * 
 * @author Tristan Kendall and Grayson Newcomer
 */
/**
 * Class to test the methods of the StudentList class
 */

public class StudentListTester {

    public static void main(String[] args) {
        
        StudentList stuList = new StudentList();
        Student student = new Student("Grayson Newcomer", "Rowing", 0.420, 5);

        stuList.readList("students.txt");

        stuList.addStudent(student);
        stuList.displayStudent("Grayson Newcomer");
        stuList.displayStudent("Tristan Kendall");
        stuList.writeList("studentout.txt");
        stuList.printClassCounts();
        
    }
    
}
