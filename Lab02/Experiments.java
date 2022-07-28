/* 
 * Created on 8/26/2021
 * 
 * ULID: gpnewco
 * CLass: IT 168
 */
package edu.ilstu;

/**
 * Program to experiment with different data types and determine compatability of different types.
 * 
 * @author Grayson Newcomer
 *
 */
public class Experiments {

    public static void main(String[] args) {
        
        short aShort = 6;
        long aLong = 105;
        int int1 = 10;
        int int2 = 11;
        float aFloat = 1.5f;
        double aDouble = 100.3;

        /**
         * The short type is able to be assigned to short values only
         * 
         * The long type is able to be assigned to short values
         * 
         * The int type is able to be assigned to short values as well as long values
         * 
         * The float type is able to be assigned to short, long, and int values
         * 
         * The double type is able to be assigned to short, long, int, and float values
         */

         aDouble = int2 / 2;
         System.out.println("aDouble = int2 / 2; results in: " + aDouble);
         aDouble = int2 / 2.0;
         System.out.println("aDouble = int2 / 2.0; results in: " + aDouble);
         aLong = int1 % 2;
         System.out.println("aLong = int1 % 2; results in: " + aLong);
         aLong = int1 % 4;
         System.out.println("aLong = int1 % 4; results in: " + aLong);
         int1 = int2 % 2;
         System.out.println("int1 = int2 % 2; results in: " + int1);
         int1 = int2 % 3;
         System.out.println("int1 = int2 % 3; results in: " + int1);
         int1 = int2 % 4;
         System.out.println("int1 = int2 % 4; results in: " + int1);
         int1 = 2 + 3 * 4;
         System.out.println("int1 = 2 + 3 * 4; results in: " + int1);
         int1 = (2 + 3) * 4;
         System.out.println("int1 = (2 + 3) * 4; results in: " + int1);


   
   
   
   
   
    }
    
}
