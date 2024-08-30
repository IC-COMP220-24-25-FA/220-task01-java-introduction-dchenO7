package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(1, 2);
        assertEquals(2, myRectangle.calcArea());

        myRectangle = new Rectangle(3, 4);
        assertEquals(12, myRectangle.calcArea());

        myRectangle = new Rectangle(.5, .5);
        assertEquals(.25, myRectangle.calcArea());
    }

    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(1, 2);
        myRectangle.doubleSize();
        assertEquals(2, myRectangle.getLength());
        assertEquals(4, myRectangle.getWidth());

        myRectangle = new Rectangle(3,4);
        myRectangle.doubleSize();
        assertEquals(6, myRectangle.getLength());
        assertEquals(8, myRectangle.getWidth());

        myRectangle = new Rectangle(.5,.5);
        myRectangle.doubleSize();
        assertEquals(1, myRectangle.getLength());
        assertEquals(1, myRectangle.getWidth());
    }

    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(1, 2);
        assertEquals(2, myRectangle.longestLineWithin());

        myRectangle = new Rectangle(3,4);
        assertEquals(5, myRectangle.longestLineWithin());

        myRectangle = new Rectangle(.5,.5);
        assertEquals(1, myRectangle.longestLineWithin());
    }
}
