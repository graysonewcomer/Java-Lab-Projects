package src.edu.ilstu;

import java.util.Scanner;

public class URLChecker {
    
public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a web address > ");
    String webAddress = keyboard.next();

    String com = ".com";
    String edu = ".edu";
    String gov = ".gov";
    String org = ".org";
    

    int lastDot = webAddress.lastIndexOf(".");

    String ending = webAddress.substring(lastDot);
    int endingLength = ending.length();

    if (endingLength == 4)
    {
        if (ending.equals(com))
        {
            System.out.println("It is a business web address");
        }
        if (ending.equals(edu))
        {
            System.out.println("It is a university web address");
        }
        if (ending.equals(gov))
        {
            System.out.println("It is a government web address");
        }
        if (ending.equals(org))
        {
            System.out.println("It is an organization web address");
        }
    }
    else
    {
        System.out.println("Web address for another entity");
    }
        keyboard.close();
}

}
