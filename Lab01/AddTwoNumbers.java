package edu.ilstu;

import java.util.Scanner;

/**
 * Class to add two numbers
 * 
 * @author Cathy Holbrook, Grayson Newcomer
 */

public class AddTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Hello");
        System.out.println("I will add two numbers for you.");
        System.out.print("Enter first number: ");
        num1 = keyboard.nextInt();

        System.out.print("Enter second number: ");
        num2 = keyboard.nextInt();

        System.out.print("The sum of those two numbers is ");
        System.out.println(num1 + num2);

        System.out.println("Now,");
        System.out.println("I will find the difference of those two numbers for you.");

        System.out.print("The difference of those two numbers is ");
        System.out.println(num1 - num2);

    }
}
