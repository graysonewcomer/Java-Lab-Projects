package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Modified 11/18/2021
 * 
 * ULIDs: gpnewco and tkenda2
 */

/**
 * Program that works with arrays of integers including sorting and merging
 * sorted arrays
 * 
 * @author Mary Elaine Califf and Grayson Newcomer and Tristan Kendall
 *
 */

  
public class ArraySorting
{
	/**
	 * reads array
	 * 
	 * @param theArray
	 * @param inputFileName
	 * @return number of elements read
	 */
	public static int readArray(int[] theArray, String inputFileName)
	{
		// read the contents of the specified file into theArray and return the number
		// of elements read
		// you may assume that the array will be big enough
		// you must handle relevant exceptions
		
		{

			Scanner input = null;
			  File f = new File(inputFileName);
					try
						 {
						input = new Scanner(f);
						 }
				catch (FileNotFoundException fnfe)
				 {
					System.out.println("File does not exist.");
				 }
				 
				int index = 0;
				while (input.hasNext())
				{
					theArray[index] = input.nextInt();
					index++;
				}
				return index;
			}
	}

	/**
	 * Wrties a specified number of elements from an array to a file
	 * 
	 * @param theArray
	 * @param numValues
	 * @param outputFileName
	 */
	public static void writeArray(int[] theArray, int numValues, String outputFileName)
	{
		// write the first numValues elements of theArray to the specified file
		// you must handle relevant exceptions
		File f = new File(outputFileName);

        PrintWriter pw;

        try
        {
            pw = new PrintWriter(new FileWriter(outputFileName, false));
            for (int i = 0; i < numValues; i++)
       		{
                String num = String.valueOf(theArray[i]) + "\n";
                pw.println(num);
        	}
            pw.close();
        }
        catch (IOException e)
         {
            System.out.println("Type error.");
         }
		 
	}

	/**
	 * Sort an array of integers from the smallest to the largest 
	 * 
	 * @param theArray
	 * @param numValues
	 */
	public static void selectionSort(int[] theArray, int numValues)
	{
		// sort the first numValue elements of theArray using the selection sort
		// algorithm
		for (int i = 0; i < numValues; i++)
		{
			int index= i;

			for(int j = i + 1; j < numValues; j++)
			{
				if (theArray[j] < theArray[index])
					index = j;
			}
			
			
			if (index != i)
			{
				int temp = theArray[i];
				theArray[i] = theArray[index];
				theArray[index] = temp;
			}
			
		}

		
	}

	/**
	 * Merges two arrays and sorts while doing it from lowest to highest numbers
	 * 
	 * @param arr1
	 * @param size1
	 * @param arr2
	 * @param size2
	 * @param mergedArr
	 * @return number of elements in merged array
	 */
	public static int mergeArrays(int[] arr1, int size1, int[] arr2, int size2, int[] mergedArr)
	{
		// implement the merge algorithm from prelab
		int left = 0;
		int right = 0;
		int count = 0;

		while(left < size1 && right < size2)
		{
			if (arr1[left] < arr2[right]){
				mergedArr[count] = arr1[left];
				left ++;
			}
			else
			{
				mergedArr[count] = arr2[right];
				right++;
			}
			count ++;
		}

		while(left < size1)
		{
			mergedArr[count] = arr1[left];
			left++;
			count ++;
		}
		while(right < size2)
		{
			mergedArr[count] = arr2[right];
			right ++;
			count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		// Test just the reading and writing -- check contents of numbersout.txt
		int[] array1 = new int[100];
		int numElems1 = readArray(array1, "numbers.txt");
		writeArray(array1, numElems1, "numbersout.txt");

		// Test the sorting -- check contents of sortedout.txt
		selectionSort(array1, numElems1);
		writeArray(array1, numElems1, "sortedout.txt");

		// Read second array and test merging -- check contents of mergedout.txt
		int[] array2 = new int[100];
		int numElems2 = readArray(array2, "numbers2.txt");
		int[] array3 = new int[200];
		int numElems3 = mergeArrays(array1, numElems1, array2, numElems2, array3);
		writeArray(array3, numElems3, "mergedout.txt");

	}

}
