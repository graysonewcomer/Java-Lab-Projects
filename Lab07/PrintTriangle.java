package edu.ilstu;
/**
 * Created on 9/30/2021
 * 
 * ULID: gpnewco
 * Class: IT 168
 */
/**
 * Class to print right triangle of asterisks consisting of
 * a number of lines based on user input
 * 
 * @author Grayson Newcomer
 * 
 */
import java.util.Scanner;

public class PrintTriangle {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number between 3 and 40: ");
        int number = keyboard.nextInt();
        int line;

        while (number < 3 || number > 40)
        {
            System.out.print("Please enter a number betweeen 3 and 40: ");
            number = keyboard.nextInt();
        }

        for (line = 1; (line <= number); line++)
        {
            for (int amount = 1; amount <= line; amount++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
      
        keyboard.close();

    }
    
}
