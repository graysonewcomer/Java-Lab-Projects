package edu.ilstu;
/**
 * Created 10/28/2021
 * 
 * ULID: gpnewco and aville4
 * 
 * Class to use and test methods with arrays and user input
 */

import java.util.Scanner;


public class ArrayFun {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        int [] intArray = new int [100];

        int count = fillArray(intArray, keyboard);
                
        int product = computeProduct(intArray, count);

        System.out.println("Product of all vali values are: " + product);

        System.out.print("Please enter a factor: ");
        int factor = keyboard.nextInt();

        System.out.println("Number of multiples: " + 
        countMultiples(intArray, count, factor));

        printArray(intArray, count);

        keyboard.close();

    }
    
    public static int fillArray(int [] array, Scanner keyboard)
    {

        int countOfElements = 0;
        
        System.out.print("Please enter values for the array. Enter -999 to stop: ");

        int value = keyboard.nextInt();
            while (value != -999){
                array[countOfElements] = value;
                countOfElements ++;
                System.out.print("Please enter values for the array. Enter -999 to stop: ");

                value = keyboard.nextInt();
            }
            
            
        
        return countOfElements;
    }

    public static int computeProduct(int [] array, int validValues)
    {
        int [] tempArray = new int [validValues];

        for (int i = 0; i < validValues; i++)
        {
            tempArray[i] = array[i];
        }
        int product = 1;
        for (int i = 0; i < tempArray.length; i++)
        {
            product = tempArray[i] * product;
        }
        return product;

    }

    public static int countMultiples(int [] array, int validValues, int factor)
    {
        int [] tempArray = new int [validValues];
        int count = 0;
        for (int i = 0; i < validValues; i++)
        {
            tempArray[i] = array[i];
        }
        for (int i=0; i < tempArray.length; i++)
        {
            if ((tempArray[i] % factor) == 0)
            {
                count ++;
            }
        }

        return count;

    }

    public static void printArray(int [] array, int validValues)
    {
        int [] tempArray = new int [validValues];
        System.out.println("Valid values are:");
        for (int i = 0; i < validValues; i++)
        {
            tempArray[i] = array[i];
        }
        
        for (int i = 0; i < tempArray.length; i++)
        {
            System.out.println(tempArray[i]);
        }
        
    }

}
