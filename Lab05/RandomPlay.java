package src.edu.ilstu;

import java.util.Random;

/**
 * Created on 9/16/2021
 * 
 * ULID: gpnewco and joedozi
 * Class: IT 168
 */
/**
 * Class to generate random numbers and compare against each other
 * and run tests against them
 * 
 * @author Grayson Newcomer and Joe Edozie
 * 
 */

public class RandomPlay {

    public static void main(String[] args) {
        
        Random random = new Random();

        int firstRandom = random.nextInt(200 -1 + 1) + 1;
        int secondRandom = random.nextInt(200 -1 + 1) + 1;

        System.out.println("First random number is " + firstRandom);

        if (firstRandom % 2 == 0)
        {
            System.out.println(firstRandom + " is an even number");
        }
        else
        {
            System.out.println(firstRandom + " is an odd number");
        }
        if (firstRandom > 100)
        {
            System.out.println(firstRandom + " is a large number");
        }
        else
            {
                System.out.println(firstRandom + " is a small number");
            }
        System.out.println("\nSecond random number is " + secondRandom);
        if (secondRandom > firstRandom)
        {
            System.out.println(secondRandom + " is greater than " + firstRandom);
        }
        else 
        {
            System.out.println(secondRandom + " is less than " + firstRandom);
        }
        

    }
    
}
