package edu.ilstu;
/**
 * Created 11/4/2021
 * 
 * ULIDs: gpnewco, nross14, joedozi
 * 
 * Class to print the number of times a daily high temperature was 
 * recorded from text file
 * 
 * @author Nicholas Ross, Joe Edozie, Grayson Newcomer
 */
import java.io.*;
import java.util.Scanner;

public class HighTemps {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int curVal;

        int [] array = new int [151];
       
         
        for(int i = 0; i < array.length; i++)
        {
            array[i]=0;
        }

        try
        {
            input = new Scanner(new File("temps.txt"));
            
            while (input.hasNextInt())
            {
                curVal = input.nextInt();
                array[curVal + 40] ++;
                
            }
            
            input.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not find data.txt file");
            System.exit(1);
        }

        System.out.println("Temperatures \tNumber of Days");
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != 0)
            {
                System.out.println((i - 40) + "\t\t" + array[i]);
            }
        }
    }
    
}
