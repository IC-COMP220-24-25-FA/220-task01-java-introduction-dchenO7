package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first<0||second<0||third<0) {
            throw new IllegalArgumentException("Can't be a negative number");
        }
        int largest = first;
        if (largest < second) {
            largest = second;
        }
        if (largest < third) {
            largest = third;
        }
        return largest;
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        if (originalPrice<0||discountPercent<0||salesTax<0) {
            throw new IllegalArgumentException("Can't be a negative number");
        }
        double salePrice;
        double discount = 0;
        if (discountPercent!=0) {
            discount = (double)(discountPercent/100) * originalPrice;
        }
        salePrice = originalPrice - discount + salesTax;
        return salePrice;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (yearsOld<0||daysSinceShoesChewed<0) {
            throw new IllegalArgumentException("Can't be a negative number");
        }
        if (daysSinceShoesChewed>7&&fetchedThePaperToday==true) {
            return true;
        }
        return false;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        int largestIndex;
        if (numbers.size() == 0) {
            return -1;
        }
        largestIndex = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(largestIndex) < numbers.get(i)) {
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        int largestIndex;
        if (numbers.size() == 0) {
            return -1;
        }
        largestIndex = 0;
        for (int i = numbers.size()-1; i > 0; i--) {
            if (numbers.get(largestIndex) < numbers.get(i)) {
                largestIndex = i;
            }
        }
        return largestIndex;    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
