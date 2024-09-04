package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        //Makes sure negative numbers produces an error
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        //return error if negative number input
        assertEquals(4.72, FunctionPractice.calcSalePrice(4, 7, 1));
        assertEquals(8.73, FunctionPractice.calcSalePrice(7.12, 25.2, 3.40),.01);
        assertEquals(59.76, FunctionPractice.calcSalePrice(59.76, 0, 0));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(30, -5, -2));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-4, 5, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-30, -5, -2));
    }
    
    @Test
    public void isGoodDogTest(){
        //return true if daysSinceShoesChewed > 7 and fetchedThePaper is true
        assertTrue(FunctionPractice.isGoodDog(2, 9, true));
        assertTrue(FunctionPractice.isGoodDog(8, 22, true));
        assertFalse(FunctionPractice.isGoodDog(1, 3, true));
        assertFalse(FunctionPractice.isGoodDog(3, 10, false));
        assertFalse(FunctionPractice.isGoodDog(5, 3, false));

        //return error if negative num input
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(-3, 5, true));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(9, -5, false));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(-7, -6, true));
    }

    @Test
    public void findFirstLargestTest(){
        List<Integer> numbers = new ArrayList<>();
        //return -1 no number in list
        assertEquals(-1, FunctionPractice.findFirstLargest(numbers));
        //1 biggest number
        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        numbers.add(10);
        numbers.add(6);
        assertEquals(3, FunctionPractice.findFirstLargest(numbers));
        //2 biggest numbers
        numbers.add(10);
        assertEquals(3, FunctionPractice.findFirstLargest(numbers));
    }

    @Test
    public void findLastLargestTest(){
        List<Integer> numbers = new ArrayList<>();
        //return -1 no number in list
        assertEquals(-1, FunctionPractice.findLastLargest(numbers));
        //1 biggest number
        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        numbers.add(10);
        numbers.add(6);
        assertEquals(3, FunctionPractice.findLastLargest(numbers));
        //2 biggest numbers
        numbers.add(10);
        numbers.add(1);
        assertEquals(3, FunctionPractice.findLastLargest(numbers));
    }
}
