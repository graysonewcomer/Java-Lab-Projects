package edu.ilstu;
/**
 * Created on 10/7/2021
 * 
 * ULID: gpnewco and tmqualt
 * Class: IT 168
 */
/**
 * Class to create objects of Circles with set radii and 
 * write methods to alter the radius as well as calculate
 * the diameter and area of the circle
 * 
 * @author Grayson Newcomer and Ty Qualters
 * 
 */
public class Circle {

    public final double PI = 3.14159;
        
    private double radius;

    /**
     * Constructor
     * 
     * @param radius
     */

    public Circle(double radius)
    {
        this.radius = radius;
    }

    /**
     * Getter for the radius
     * 
     * @return the radius of the circle
     */
    public double getRadius()
    {
        return this.radius;
    }


    /**
     * Setter for the radius of the circle
     * 
     * @param radius the new radius of the circle
     */
    public void setRadius(double radius)
    {
        this.radius = radius;
    }


    /**
     * Calculates area of the circle
     * 
     * @return area of the circle
     */
    public double calculateArea()
    {
        return PI * radius * radius;
    }

    /**
     * Calculates diameter of the circle
     * 
     * @return diameter of the circle
     */
    public double calculateDiameter()
    {
        return radius * 2;
    }

    /**
     * Calculates circumference of the circle
     * 
     * @return circumference of the circle
     */
    public double calculateCircumference()
    {
        return 2 * PI * radius;
    }
        


    
    
}
