package edu.ilstu;

import java.io.*;
import java.util.Scanner;
/**
 * Created 11/11/2021
 * 
 * ULIDs: gpnewco and tkenda2
 * 
 * @author Tristan Kendall and Grayson Newcomer
 */
/**
 * A class to maintain an array of students
 */
public class StudentList
{
	

	private Student [] stuArray;
	private int size;


	public StudentList()
	{
		stuArray = new Student[100];
		size = 0;

	}


	private int studentIndex(String name)
	{
		for(int i = 0; i < size; i++)
		{
			if(name.equals(stuArray[i].getName()))
				return i;
		}
		return -1;
	
	}




	/**Reads a list of students from a file
	 * @param fileName
	 *   Name of the file to read from
	 * 
	 */
	public void readList(String fileName) 
	{

		try{

		Scanner input = new Scanner(new File(fileName));
		
		while(input.hasNext())
		{
		Student student = new Student();
		student.read(input);
		stuArray[size] = student;
		size++;
		}
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Could not find " + fileName);
			System.exit(1);
		}
		
	}

	/** Writes a list of students to a file
	 * @param fileName
	 *   Name of the file to write to
	 */
	public void writeList(String fileName)
	{
		PrintWriter outfile = null;
		try
		{
			outfile = new PrintWriter(new FileWriter(fileName));
			

			for(int i = 0; i < size; i++)
			{
				stuArray[i].write(outfile);
			}
			
			outfile.close();
		}
		catch (IOException e)
		{
			System.out.println("An error occurred: "+e);
			System.out.println("The list of students was not written");
		}
	}

	/** Add a student to the end of the list
	 * @param aStudent
	 *   The student to add
	 */
	public void addStudent(Student aStudent)
	{
		if(size < 100)
		{
			stuArray[size] = aStudent;
			size++;
		}
	}

	/**
	 * @param studentName
	 */
	public void displayStudent(String studentName)
	{
		
		int index;
		index = studentIndex(studentName);
		if (index != -1)
			System.out.println(this.stuArray[index]);
		else	
		{
			System.out.println("Student not found.");
		}
	}

	
	/**
	 * Prints the number of students in each class level
	 */
	public void printClassCounts()
	{

		int [] countArray = new int[4];

		for(int i = 0; i < size; i++)
		{
			if(stuArray[i].getClassLevel().equals("Freshman"))
				countArray[0]++;
			if(stuArray[i].getClassLevel().equals("Sophomore"))
				countArray[1]++;
			if(stuArray[i].getClassLevel().equals("Junior"))
				countArray[2]++;
			if(stuArray[i].getClassLevel().equals("Senior"))
				countArray[3]++;
		}
		System.out.println("Freshman count: " + countArray[0]);
		System.out.println("Sophomore count: " + countArray[1]);
		System.out.println("Junior count: " + countArray[2]);
		System.out.println("Senior count: " + countArray[3]);

	}
}
