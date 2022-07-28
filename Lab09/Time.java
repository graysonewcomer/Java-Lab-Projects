/**
 * ULID: tmqualt, gpnewco, aville4
 * Date: 10/14/2021
 */
package edu.ilstu;
/**
 * Program that calculates Time in 12 and 24 hours time
 * @author Ty Qualters, Grayson Newcomer, Alan Villegas
 */

public class Time {
    
    private int hours;
    private int minutes;

    /**
     * Default constructor
     * 
     */
    public Time()
    {
        this.hours = 0;
        this.minutes = 0;
    }

    /**
     * Constructor 
     * 
     * @param hours
     * @param minutes
     */
    public Time(int hours, int minutes)
    {
        if (hours < 0 || hours > 23)
        {
            this.hours = 0;
            this.minutes = 0;
            
        }            
        else if (minutes < 0 || minutes > 59)
        {
            this.hours = 0;
            this.minutes = 0;
            
        }
        else 
        {
            this.hours = hours;
            this.minutes = minutes;
            
        }        
    }

    /**
     * Constructor 
     * 
     * @param hours
     * @param minutes
     * @param dayOrNight
     */
    public Time(int hours, int minutes, String dayOrNight)
    {
        if (!dayOrNight.equalsIgnoreCase("AM") || !dayOrNight.equalsIgnoreCase("PM"))
        {
            this.hours = 0;
            this.minutes = 0;
            
        }
        else if (hours < 1 || hours > 12)
        {
            this.hours = 0;
            this.minutes = 0;
            
        }
        else if (minutes < 0 || minutes > 59)
        {
            this.hours = 0;
            this.minutes = 0;
            
        }
        else
        {
            this.hours = hours;
            this.minutes = minutes;
        }  
    }

    /**
     * Getter for minutes
     * 
     * @return minutes of object
     */
    public int getMinutes()
    {
        return this.minutes;
    }

    /**
     * Getter for hours
     * 
     * @return hours of object
     */
    public int getHours()
    {
        return this.hours;
    }

    /**
     * Setter for minutes
     * 
     * @param minutes
     */
    public void setMinutes(int minutes)
    {
        if (minutes < 0 || minutes > 59)
            this.minutes = 0;
        else
            this.minutes = minutes;
    }

    /**
     * Setter for hours
     * 
     * @param hours
     */
    public void setHours(int hours)
    {
        if (hours < 0 || hours > 23)
            this.hours = 0;
        else
            this.hours = hours;
    }

    /**
     * Compares two time objects to see if they are equal
     * 
     * @param Time
     * @return true/false if they are equal times
     */
    public boolean equals(Time Time)
    {
        if (this.hours == Time.getHours() && this.minutes == Time.getMinutes())
            return true;
        else 
            return false;
    }

    /**
     * Prints out formatted time
     * 
     * @return string of formatted time
     */
    public String toString()
    {
        return (this.hours < 10 ? "0" + this.hours : this.hours) + ":" + (this.minutes < 10 ? "0" + this.minutes : this.minutes);
    }

    /**
     * Converts time to 12 hour time then gets it
     * 
     * @return time in 12 hours time format
     */
    public String get12HourTime()
    {
        int hours = this.hours;
        boolean isAM = true;
        if(hours > 12) {
            hours -= 12;
            isAM = false;
        }
        else if (hours == 12)
        {
            isAM = false;
        }

        return (hours < 10 ? "0" + hours : hours) + ":" + (this.minutes < 10 ? "0" + this.minutes : this.minutes) + (isAM ? " A.M.":" P.M.");

    }


}
