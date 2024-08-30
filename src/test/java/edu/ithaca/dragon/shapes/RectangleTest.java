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
}
