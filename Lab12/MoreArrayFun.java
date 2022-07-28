package edu.ilstu;
/**
 * Created 11/4/2021
 * 
 * ULIDs: gpnewco, nross14, joedozi
 * 
 * Class to utilize methods from the ArrayManager class and manipulate
 * arrays with them
 * 
 * @author Nicholas Ross, Joe Edozie, Grayson Newcomer
 */
import java.util.Scanner;

public class MoreArrayFun {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        ArrayManager arrayMan = new ArrayManager();
        arrayMan.fillArray();
        System.out.println(arrayMan.minimumValue());
        System.out.println(arrayMan.maximumValue());
        
        System.out.print("Please enter a number to find index(-999 to quit): ");
        int value = keyboard.nextInt();
        

        while(value != -999)
        {
        int indexOf = arrayMan.firstInstance(value);
        if(indexOf == -1)
            System.out.println("Not Found");
        else
            System.out.println("First index of number is: " + indexOf);

        System.out.print("Please enter a number to find index(-999 to quit: ");
        value = keyboard.nextInt();
        }

        keyboard.close();
    }
    
}
