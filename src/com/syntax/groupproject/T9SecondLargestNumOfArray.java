/*
   Write a java program to find the second-largest number in the array?
 */
package com.syntax.groupproject;

public class T9SecondLargestNumOfArray {
    public static void main(String[] args) {
        int[] numbers = {34, 30, 27, 55, 25, 31, 71, 24, 32, 35, 10 };

        int largestNum = numbers[0], secondLargestNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNum) {
                secondLargestNum = largestNum;
                largestNum = numbers[i];
            }
            if (numbers[i] != largestNum && numbers[i] > secondLargestNum) {
                secondLargestNum = numbers[i];
            }
        }
        System.out.println("Largest number is : " + largestNum);
        System.out.println("Second largest number is : " + secondLargestNum);

    }
}
