package edu.ilstu;
/**
 * Created on 9/23/2021
 * 
 * ULID: gpnewco and joedozi
 * Class: IT 168
 */
/**
 * Class to add odd numbers in order based on a count entered by the user
 *  
 * @author Grayson Newcomer and Joe Edozie
 * 
 */

import java.util.Scanner;
public class OddIntegers {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int oddNumber = 1;

        System.out.print("Please enter a number: ");
        int n = keyboard.nextInt();

        while (count != n)
        {
            sum += oddNumber;
            if (count == 0)
            {
                System.out.print(oddNumber);
            }
            else
            {
                System.out.print(" + " + oddNumber);
            }
            oddNumber += 2;
            count += 1;
        }
        System.out.println(" = " + sum);
        keyboard.close();
    } 
        
}
