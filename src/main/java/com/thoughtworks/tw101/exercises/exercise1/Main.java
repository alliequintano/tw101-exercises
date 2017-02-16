package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int oddSum = 0;

        for (int i = 1; i < 100; i += 2) {
            oddSum += i;
            System.out.print(i + ", ");
        }
        System.out.print("\nSum of odd numbers 1 to 100 = " + oddSum);
    }
}
