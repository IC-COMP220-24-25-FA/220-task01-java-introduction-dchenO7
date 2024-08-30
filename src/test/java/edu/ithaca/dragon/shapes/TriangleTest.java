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
}
