package com.company;

import java.util.Random;

public interface Player {

    /*
    This enum stores the 3 possible choices (ROCK, PAPER, and SCISSORS)
    I used an enum because these 3 choices never change and to make my code object-oriented.
    I implemented a beats function in each enum that will return the result against each match-up and a toString function that will return the enum in string format
     */
    enum Choice{
        ROCK {
            @Override
            public int beats(Choice other) {
                if(other.equals(ROCK))
                    return 2;

                if(other.equals(SCISSORS))
                    return 1;

                return 0;
            }

            @Override
            public String toString(){
                return "Rock";
            }
        },
        PAPER{
            @Override
            public int beats(Choice other) {
                if(other.equals(PAPER))
                    return 2;

                if(other.equals(ROCK))
                    return 1;

                return 0;
            }

            @Override
            public String toString() {
                return "Paper";
            }
        },
        SCISSORS{
            @Override
            public int beats(Choice other) {
                if(other.equals(SCISSORS))
                    return 2;

                if(other.equals(PAPER))
                    return 1;

                return 0;
            }

            @Override
            public String toString() {
                return "Scissors";
            }
        };

        public static Choice parseType(int value) {
            if (value == 0)
                return Choice.ROCK;

            if (value == 1)
                return Choice.PAPER;

            if (value == 2)
                return Choice.SCISSORS;


            return null;
        }

        public static Choice randomPlay(){
            Random rand = new Random();
            int value = rand.nextInt(3);

            return parseType(value);
        }

        public abstract int beats(Choice other);
        public abstract String toString();
    }

    Choice play();


}
