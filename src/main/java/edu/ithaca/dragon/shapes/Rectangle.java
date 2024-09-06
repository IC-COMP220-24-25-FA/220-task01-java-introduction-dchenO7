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
        this.length *=2;
        this.width *=2;
    }

    public double longestLineWithin(){
        double hypotenus = (this.length*this.length) + (this.width*this.width);
        hypotenus = Math.sqrt(hypotenus);
        return hypotenus;
    }
    
    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public String toString(){
        return "Rectangle length: " + length + "\nRectangle width: " + width;
    }
}
