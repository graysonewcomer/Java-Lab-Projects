package edu.ilstu;
/**
 * Created on 10/7/2021
 * 
 * ULID: gpnewco and tmqualt
 * Class: IT 168
 */
/**
 * Class to utilize methods of the Circle class based on user
 * input of radius.
 * 
 * @author Grayson Newcomer and Ty Qualters
 * 
*/
import java.util.Scanner;

public class CircleCheck {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter radius of circle: ");

        double radius = keyboard.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Area = " + circle.calculateArea());
        System.out.println("Diameter = " + circle.calculateDiameter());
        System.out.println("Circumference = " + circle.calculateCircumference());

        
        keyboard.close();
    }
    
}
