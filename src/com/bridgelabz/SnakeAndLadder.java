package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder program!");

        int player1Position = 0;
        int player1Dice = (int)(Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("Dice roll value: " + player1Dice);
    }


    }

