package edu.ilstu;

import java.util.Scanner;

/**
 * Created on 9/2/2021
 * 
 * ULID: gpnewco
 * Class: IT 168
 */
/**
 * Class to calculate miles per gallon given user input for miles traveled, and
 * gallons used
 * 
 * @author Grayson Newcomer
 * 
 */

public class MileageCalculator
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        int miles;
        int gallons;

        System.out.print("Enter amount of miles driven > ");
        miles = keyboard.nextInt();
        System.out.print("Enter amount of gallons of gas used > ");
        gallons = keyboard.nextInt();

        double milesPerGallon = ((double) miles / (double) gallons);
        System.out.println("The miles per gallon is: " + milesPerGallon + "mpg");

        keyboard.close();
    }

}
