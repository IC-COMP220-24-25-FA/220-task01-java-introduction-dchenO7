package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(2,2);
        assertEquals(2, myTriangle.calcArea());

        myTriangle = new Triangle(5.5, 10);
        assertEquals(27.5, myTriangle.calcArea());

        myTriangle = new Triangle(.001, .2);
        assertEquals(.0001, myTriangle.calcArea());
    }

    @Test
    public void doubleSize(){
        Triangle myTriangle = new Triangle(2, 2);
        myTriangle.doubleSize();
        assertEquals(4, myTriangle.getBase());
        assertEquals(4, myTriangle.getHeight());

        myTriangle = new Triangle(5.5, 10);
        myTriangle.doubleSize();
        assertEquals(11, myTriangle.getBase());
        assertEquals(20, myTriangle.getHeight());

        myTriangle = new Triangle(.001, .2);
        myTriangle.doubleSize();
        assertEquals(.002, myTriangle.getBase());
        assertEquals(.4, myTriangle.getHeight());
    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(2,2);
        assertEquals(2.83, myTriangle.longestLineWithin());

        myTriangle = new Triangle(5.5, 10);
        assertEquals(11.41, myTriangle.longestLineWithin());

        myTriangle = new Triangle(.001, .2);
        assertEquals(.2, myTriangle.longestLineWithin());
    }
}
