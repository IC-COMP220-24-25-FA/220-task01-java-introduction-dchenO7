package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        double rectArea = this.length * this.width;
        return rectArea;
    }

    public void doubleSize(){
        throw new RuntimeException("Not implemented yet");
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
    
    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }
}
