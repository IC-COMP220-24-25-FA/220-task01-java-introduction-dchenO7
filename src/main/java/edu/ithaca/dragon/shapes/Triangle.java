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
        base = (double) base * 2;
        height = (double) height * 2;
    }

    public double longestLineWithin(){
        double hypotenus = (double)(base*base) + (height*height);
        hypotenus = Math.sqrt(hypotenus);
        return hypotenus;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public String toString(){
        return "Triangle base: " + base +"\nTriangle height: " + height;
    }
}
