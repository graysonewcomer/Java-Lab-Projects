package edu.ilstu;

import java.io.*;
import java.util.*;

/**
 * Created 11/4/2021
 * 
 * ULIDs: gpnewco, nross14, joedozi
 * 
 * Create ArrayManager objects and use the methods defined in this class
 * 
 * @author Mary Elaine Califf, Nicholas Ross, Joe Edozie, Grayson Newcomer
 */
public class ArrayManager
{
    private int [] array;
    private int count;

    public ArrayManager()
    {
        this.array = new int[100];
    }
    
    public  void fillArray()
    {
        int curVal;
        
        Scanner input = null;
        try
        {
            input = new Scanner(new File("data.txt"));
            // set the current number of items in the array to zero
            
            while (input.hasNextInt())
            {
                curVal = input.nextInt();
                // add code to store curVal into the array and update other information as needed
                
                array[count] = curVal;
                count++;
            }
            // for(int i = 0; i <= count; i++)
            // {
            //     System.out.println(array[i]);
            // }
            input.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not find data.txt file");
            System.exit(1);
        }
    }


    public int minimumValue()
    {

        int minimum = this.array[0];

        for(int i = 1; i < this.array.length; i++)
        {
            if (this.array[i] < minimum)
                minimum = this.array[i];
        }
        return minimum;
    }


    public int maximumValue()
    {
        int maximum = this.array[0];

        for (int i = 0; i<this.array.length; i++){

            if (this.array[i]> maximum)

            maximum = this.array[i];
        }
        return maximum;
    }

    public int firstInstance(int value){
        
        for(int i = 0; i < this.array.length; i++)
        {
            if(this.array[i] == value)
            {
                return i;
            }    
        }
        
            return -1;

    }
    }

