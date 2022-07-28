package edu.ilstu;

/**
 * Created on 9/9/2021
 * 
 * ULID: gpnewco and joedozi
 * Class: IT 168
 */
/**
 * Class to calculate time in hours, minutes, and seconds
 * 
 * @author Grayson Newcomer and Joe Edozie
 * 
 */

import java.util.Scanner;

public class TimeCalculator
{

    public static void main(String[] args)
    {

        int seconds;
        int hours;
        int minutes;
        int totalSeconds;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of seconds: ");
        totalSeconds = keyboard.nextInt();

        minutes = (totalSeconds / 60);
        seconds = (totalSeconds % 60);
        hours = (minutes / 60);
        minutes %= 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        keyboard.close();

    }

}
