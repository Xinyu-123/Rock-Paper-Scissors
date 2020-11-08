package com.company;

import java.util.Scanner;

public class Human implements Player {
    Scanner scan = new Scanner(System.in);
    Choice choice = null;
    int score = 0;
    int value;
    @Override
    public Choice play() {
        choice = null;

        //I wrapped this in a while loop so if the player entered an invalid entry, the code will just loop again to make a new selection
        while(choice == null){
            System.out.println("Choose 0 for Rock, 1 for Paper, 2 for Scissors:");

            try {
                value = scan.nextInt();
            }
            catch (java.util.InputMismatchException e) {
                scan.nextLine();
                System.out.println("Invalid Entry, Try again.");
                continue;
            }

            //Use the parseType function in the choice enum to return either ROCK, PAPER, or SCISSORS depending on the value entered
            choice = Choice.parseType(value);

            if(choice == null)
                System.out.println("Invalid Entry, Try again.");
        }

        System.out.println("You selected: " + choice.toString());
        return choice;
    }
}
