/*
 * Created on 9/23/21
 * 
 * ULID: gpnewco and joedozi
 * Class: IT 168
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Solving errors in code using debugger tool in switch statements
 * 
 * @author Grayson Newcomer and Joe Edozie
 *
 */
public class SwitchErrors {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Key:  1=blue, 2=red, 3=green");
		System.out.print("Enter a number and I'll return ");
		System.out.print(" the corresponding color.  ");

		int number = keyboard.nextInt();

		switch (number) {
			case 1:
				System.out.println("You chose blue!");
				break;
			case 2:
				System.out.println("You chose red!");
				break;
			case 3:
				System.out.println("You chose green!");
				break;
			default:
				System.out.println("Color not available!");
				break;
		}
		keyboard.close();
	}

}
