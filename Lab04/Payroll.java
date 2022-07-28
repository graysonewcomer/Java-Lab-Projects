package edu.ilstu;

/**
 * Created on 9/9/2021
 * 
 * ULID: gpnewco and joedozi
 * Class: IT 168
 */
/**
 * Class to manage employee information, calculate raises, 
 * and print payrolls for employees created by the user as well as
 * a predefined one.
 * 
 * @author Grayson Newcomer and Joe Edozie
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Payroll
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$#.00");

        System.out.print("Enter first name: ");
        String firstName = keyboard.next();
        System.out.print("Enter last name: ");
        String lastName = keyboard.next();
        System.out.print("Enter pay rate: ");
        int rate = keyboard.nextInt();
        System.out.println("");

        Employee employee = new Employee("Smith", "John", 15.00);
        Employee secondEmployee = new Employee(lastName, firstName, rate);

        System.out.println("Employee 1");
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Pay rate is: " + employee.getPayRate());
        System.out.println("");

        System.out.println("Employee 2");
        System.out.println("First name: " + secondEmployee.getFirstName());
        System.out.println("Last name: " + secondEmployee.getLastName());
        System.out.println("Pay rate is: " + secondEmployee.getPayRate());
        System.out.println("");

        Double calculatedPay = employee.calculatePay(42);
        calculatedPay.toString();
        String formattedPay = df.format(calculatedPay);

        System.out.println("John Smith received " + formattedPay);

        calculatedPay = secondEmployee.calculatePay(40);
        calculatedPay.toString();
        formattedPay = df.format(calculatedPay);

        System.out.println(
                secondEmployee.getFirstName() + " " + secondEmployee.getLastName() + " received: " + formattedPay);

        double firstPercentRaise;
        System.out.print("Enter percent raise for employee one: ");
        firstPercentRaise = keyboard.nextDouble();

        employee.giveRaise(firstPercentRaise);

        double secondPercentRaise;
        System.out.print("Enter percent raise for employee two: ");
        secondPercentRaise = keyboard.nextDouble();
        System.out.println("");

        secondEmployee.giveRaise(secondPercentRaise);

        employee.printPayrollLine(42);
        secondEmployee.printPayrollLine(40);

        System.out.println("");

        employee.print();
        System.out.println("");
        secondEmployee.print();

        keyboard.close();
    }

}
