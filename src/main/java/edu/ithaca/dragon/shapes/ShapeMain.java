package edu.ithaca.dragon.shapes;

import java.util.Scanner;
import java.util.ArrayList;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

        double min = 0;
        double max = 100;
        Rectangle rect1 = new Rectangle(min + (double)(Math.random()*((max-min)+1)), min + (double)(Math.random()*((max-min)+1)));
        Rectangle rect2 = new Rectangle(min + (double)(Math.random()*((max-min)+1)), min + (double)(Math.random()*((max-min)+1)));
        Rectangle rect3 = new Rectangle(min + (double)(Math.random()*((max-min)+1)), min + (double)(Math.random()*((max-min)+1)));
        Rectangle rect4 = new Rectangle(min + (double)(Math.random()*((max-min)+1)), min + (double)(Math.random()*((max-min)+1)));
        Rectangle rect5 = new Rectangle(min + (double)(Math.random()*((max-min)+1)), min + (double)(Math.random()*((max-min)+1)));
        ArrayList<Rectangle> rectList = new ArrayList<>();
        rectList.add(rect1);
        rectList.add(rect2);
        rectList.add(rect3);
        rectList.add(rect4);
        rectList.add(rect5);

        for (int i = 0; i < 5; i++){
            System.out.println("The area of this rectangle is:");
            System.out.println(rectList.get(i).calcArea());
            System.out.println("The longest line that can be drawn in this rectangle is:");
            System.out.println(rectList.get(i).longestLineWithin());
        }
        
        for (int i = 0; i < 5; i++){
            Scanner myRect = new Scanner(System.in);
            System.out.println("Type a number between 1 and 5 to double that rectangle's size");
            int userRect = myRect.nextInt() - 1;
            rectList.get(userRect).doubleSize();

            for (int j = 0; j < 5; j++){
                System.out.println("The area of this rectangle is:");
                System.out.println(rectList.get(j).calcArea());
                System.out.println("The longest line that can be drawn in this rectangle is:");
                System.out.println(rectList.get(j).longestLineWithin());
            }
        }
        System.out.println("Ok bye bye");
    }
}

