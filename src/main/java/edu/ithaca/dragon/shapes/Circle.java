package edu.ithaca.dragon.shapes;

public class Circle implements Shape {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double circArea = (double) 3.14159 * this.radius * this.radius;
        return circArea;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius *=2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double diameter = (double)radius * 2;
        return diameter;
        }

    /**
     * @return radius of this circle
     */
    public double getRadius(){
        return this.radius;
    }

    public String toString(){
        return "Circle radius: " + radius;
    }
}
