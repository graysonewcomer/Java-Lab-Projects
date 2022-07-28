package edu.ilstu;
/**
 * Created on 9/30/2021
 * 
 * ULID: gpnewco
 * Class: IT 168
 */
/**
 * Class to calculate average, maximum, minimum, number of stuents
 * and number of As on an exam based on user input of all
 * student scores.
 * 
 * @author Grayson Newcomer
 * 
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class ExamCalculations {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("00.0");

        System.out.print("Please enter exam score. Enter -1 to stop: ");
        int score = keyboard.nextInt();
        int count = 0;
        int sum = 0;
        int countOfA = 0;
        int maximum = score;
        int minimum = score;

        while (score != -1)
        {
            sum += score;
            if (score >= 90 && score <= 100)
                countOfA++;
            if (score > maximum)
                maximum = score;
            if (score < minimum)
                minimum = score;
            count ++;
            System.out.print("Please enter exam score. Enter -1 to stop: ");
            score = keyboard.nextInt();
        }

        System.out.println("Number of students that took exam: " + count);
        System.out.println("Minimum score: " + minimum);
        System.out.println("Maximum score: " + maximum);
        System.out.println("Average score: " + dF.format((double)(sum)/count));
        System.out.println("Number of As on exam: " + countOfA);


        keyboard.close();
    }
    
}
