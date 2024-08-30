package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double baseIn, double heightIn){
        base = baseIn;
        height = heightIn;
    }

    public double calcArea(){
        double triArea = (double).5 * base * height;
        return triArea;
    }

    public void doubleSize(){

    }

    public double longestLineWithin(){

    }
}
