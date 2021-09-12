/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Here we take in the input from a user
        System.out.print("How many people? ");
        String people = input.nextLine();
        System.out.print("How many pizzas do you have? ");
        String pizza = input.nextLine();
        System.out.print("How many slices per pizza? ");
        String slices = input.nextLine();
        //We change the format of the input from string to integer
        int People = Integer.parseInt(people);
        int Pizza = Integer.parseInt(pizza);
        int Slices = Integer.parseInt(slices);
        //Here we sum up the total amount of slices
        int totalSlices = Pizza * Slices;
        System.out.print(String.format("%s people with %s pizzas (" +totalSlices+ " slices)\n", people, pizza));
        System.out.print(String.format("Each person gets "+(totalSlices/People)+" pieces of pizza.\n"));
        System.out.print(String.format("There are " + (totalSlices%People) + " leftover pieces."));
    }
}
