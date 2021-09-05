package exercise04;

import java.util.Scanner;

//Create a simple mad-lib program that prompts for a noun, a verb, an adverb,
// and an adjective and injects those into a story that you create.
public class Solution04 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 James Jaro
     */
    public static void main(String[] args){
        /*
        Ask for a noun, verb, adjective, and an adverb.
        take in the inputs from the user and store them.
        print out the output as specified by the example.
         */
        Scanner noun = new Scanner(System.in);
        Scanner verb = new Scanner(System.in);
        Scanner adverb = new Scanner(System.in);
        Scanner adjective = new Scanner(System.in);
        //ask for inputs and take the input to store them.
        System.out.print("Enter a noun:");
        String noun2 = noun.nextLine();
        System.out.print("Enter a verb:");
        String verb2 = verb.nextLine();
        System.out.print("Enter a adjective:");
        String adjective2 = adjective.nextLine();
        System.out.print("Enter a adverb:");
        String adverb2 = adverb.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!%n",verb2,adjective2,noun2, adverb2 );
    }
}
