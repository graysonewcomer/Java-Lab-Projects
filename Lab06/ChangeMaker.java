package edu.ilstu;
/**
 * Created on 9/23/2021
 * 
 * ULID: gpnewco and joedozi
 * Class: IT 168
 */
/**
 * Class to calculate amount of coins will be given in change after price is entered
 * 
 * @author Grayson Newcomer and Joe Edozie
 * 
 */

import java.util.Scanner;
public class ChangeMaker {
    
public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Item price must be 25 cents to a dollar, in 5-cent increments. \nEnter item price: ");
    int price = keyboard.nextInt();
    int change = 0;
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    String stringQuarters = "";
    String stringDimes = "";
    String stringNickels = "nickel";
    




    if ((price >= 25) && (price <= 100) && (price%5 == 0))
    {
        
            change = (100 - price);
    }
    else
        {
            System.out.println("Invalid cost - must be evenly divisible by 5");
        }
    
    if (price > 100)
    {
        System.out.println("Invalid cost - must be no more than 100 cents");
    }
     if (price < 25)
    {
        System.out.println("Invalid cost - must be no less than 25 cents");
    }

    

    if (change == 100)
    {
        System.out.println("There is no change");
    }
    else
    {
        quarters = (change / 25);
        change -= (25 * quarters);
        if (change > 0)
        {
            dimes = (change / 10);
            change -= (dimes * 10);
        }
        if (change > 0)
        {
            nickels = 1;
        }
       

        if (quarters > 1)
        {
             stringQuarters = "quarters";
        }
        else
        {
             stringQuarters = "quarter";
        }
        if (dimes > 1)
        {
            stringDimes = "dimes";
        }
        else
        {
            stringDimes = "dime";
        }


    }

    System.out.println("Your change is");
    if (quarters > 0)
        System.out.println(quarters + " " + stringQuarters);
    if (dimes > 0)
        System.out.println(dimes + " " + stringDimes);
    if (nickels == 1)
        System.out.println(nickels + " " + stringNickels);
       
        keyboard.close();
}

}
