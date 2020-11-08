package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human human = new Human();
        Computer computer = new Computer();

        System.out.println("This is Xinyu Dong's Rock Paper Scissors game for my BMO application!");

        //While loop in case the player wants to play again
        while(true){
            //Save the Player's choice and the computer's choice
            Player.Choice human_choice = human.play();
            Player.Choice computer_choice = computer.play();

            //Caluclate who wins
            if(human_choice.beats(computer_choice) == 1) {
                System.out.println("You have beaten the computer!");
                human.score++;
            }
            else if(human_choice.beats(computer_choice) == 2)
                System.out.println("You have tied with the computer.");
            else{
                System.out.println("You have lost to the computer.");
                computer.score++;
            }


            System.out.println("The total score is: Player-" + human.score + " Computer-" + computer.score);

            System.out.println("Would you like to play again? (y/N)");

            String ans = scanner.nextLine();

            if (!(ans.equals("y") || ans.equals("Y")))
                break;

        }


    }
}
