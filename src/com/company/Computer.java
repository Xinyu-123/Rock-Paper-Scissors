package com.company;

public class Computer implements Player {
    Choice choice = null;
    int score = 0;

    @Override
    public Choice play(){
        //Choose a random int between 0-2 (inclusive) and return the corresponding choice
        choice = Choice.randomPlay();
        System.out.println("The computer has picked: " + choice.toString());
        return choice;
    }
}
