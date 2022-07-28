package edu.ilstu;

/**
 * Created on 9/2/2021
 * 
 * ULID: gpnewco
 * Class: IT 168
 */
/**
 * Class to experiment with the String class and its different methods
 * 
 * @author Grayson Newcomer
 * 
 */

public class StringExperiment
{

    public static void main(String[] args)
    {

        String firstName = "Grayson";
        String middleName = "Patrick";
        String lastName = "Newcomer";

        System.out.println(firstName + " " + middleName + " " + lastName);

        char middleInitial = middleName.charAt(0);

        System.out.println(firstName + " " + middleInitial + ". " + lastName);

        System.out.println(firstName.toUpperCase() + " " + lastName.toLowerCase());

        int lastNameLength = lastName.length();

        System.out.println("Length of last name = " + lastNameLength);

        char middleLetterLastName = lastName.charAt(lastNameLength / 2);

        System.out.println("The middle letter of my last name is: " + middleLetterLastName);

        int firstNameLength = firstName.length();

        char lastLetterFirstName = firstName.charAt(firstNameLength - 1);

        System.out.println("The last letter of my first name is: " + lastLetterFirstName);
    }

}
