/**
 * ULID: tmqualt, gpnewco, aville4
 * Date: 10/14/2021
 */
package edu.ilstu;
/**
 * Program to test and use methods of the Time class 
 * @author Ty Qualters, Grayson Newcomer, Alan Villegas
 */
public class TimeTester {
    
    public static void main(String[] args) {
        
    
    Time time1 = new Time(1,45, "PM");
    Time time2 = new Time(16,40);
    Time time3 = new Time(14,45);
    Time time4 = new Time(25,50);
    Time time5 = new Time(1,45);
    Time time6 = new Time(5,36, "AM");
    
    System.out.println("This will set minutes in time3 to 68. Expected result is minutes will be 0. Actual result: ");
    time3.setMinutes(68);
    System.out.println(time3.getMinutes());

    System.out.println("This will compare if time3 equals time2. Expected result true. Actual result:");
    System.out.println(time3.equals(time2));

    System.out.println("This will print out time3 formatted as hh:mm. Expected result 14:45. Actual result:");
    System.out.println(time3);

    System.out.println("This will convert time3 to 12 hour time. Expected result 2:45. Actual result: ");
    System.out.println(time3.get12HourTime());

    System.out.println("This will set the minutes in time5 to 44. Expected results is minutes will be 44. Actual results:");
    time5.setMinutes(44);
    System.out.println(time5.getMinutes());

    System.out.println("This will set the minutes of time6 to 59. Expected result is minutes will be set to 59. Actual result:");
    time6.setMinutes(59);
    System.out.println(time6.getMinutes());

    System.out.println("This will set the hours of time5 to 3. Expected result is hours will be 3. Actual result:");
    time5.setHours(3);
    System.out.println(time5.getHours());

    System.out.println("This will set the hours of time6 to 6. Expected result is hours will be 6. Actual result: ");
    time6.setHours(6);
    System.out.println(time6.getHours());

    System.out.println("This will compare if time5 is equal to time6. Expected result is false. Actual result:");
    System.out.println(time5.equals(time6));

    System.out.println("This will compare if time6 equals time1. Expected result is false. Actual result:");
    System.out.println(time6.equals(time1));

    System.out.println("This will print out the time of time5. Expected result is 3:44. Actual result:");
    System.out.println(time5);

    System.out.println("This will print out the time of time6. Expected result is 6:59. Actual result: ");
    System.out.println(time6);

    System.out.println("This will set the hours of time5 to 13 then print out time5 in 12 hour time. Expected result is 1:44. Actual result: ");
    time5.setHours(13);
    System.out.println(time5.get12HourTime());

    System.out.println("This will set the hours of time6 to 23 then print it out in 12 hour time. Expected result is 11:59. Actual result:");
    time6.setHours(23);
    System.out.println(time6.get12HourTime());

    time4.setHours(0);
    time4.setMinutes(30);
    System.out.println(time4.get12HourTime());

    }
}
