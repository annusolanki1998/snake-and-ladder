package com.bridgelabz;

import java.util.Random;
public class SnakeAndLadder {
    static final int Snake = 2;
    static final int Ladder = 1;
    static final int Noplay = 0;
    static int diceCount = 0;
    static final int PLAYER1 = 1;
    static final int PLAYER2 = 2;

    public static int positionCheck(int dice, int position, int optCheck) {

        if ((optCheck == Ladder) && (position + dice) <= 100) {
            System.out.print(" ladder");
            position = position + dice;
        } else if (optCheck == Snake) {
            System.out.print("Snake");
            position = position - dice;
        } else {
            System.out.print("No play");
        }
        if (position < 0) {
            position = 0;
        }
        System.out.println("position: " + position);
        return position;

    }

    public static void main(String[] args) {
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        int player = PLAYER1;
        System.out.println("playerOnePosition: " + playerOnePosition);
        System.out.println("playerTwoPosition: " + playerTwoPosition);
        Random random = new Random();

        while ((playerOnePosition < 100) && (playerTwoPosition < 100)) {

            int dice = random.nextInt(6) + 1;
            System.out.println("dice: " + dice);
            ++diceCount;
            int optCheck = random.nextInt(3);
            System.out.println("optCheck: " + optCheck);

            if (player == PLAYER1) {

                playerOnePosition = positionCheck(dice, playerOnePosition, optCheck);
                if ((optCheck == Snake) || (optCheck == Noplay)) {
                    player = PLAYER2;
                }
            } else if (player == PLAYER2) {
                playerTwoPosition = positionCheck(dice, playerTwoPosition, optCheck);
                if ((optCheck == Snake) || (optCheck == Noplay)) {
                    player = PLAYER1;
                }
            }

        }
        System.out.println();
        System.out.println("Player One Position: " + playerOnePosition);
        System.out.println("Player Two Position: " + playerTwoPosition);
        System.out.println("diceCount: " + diceCount);
        if (playerOnePosition == 100) {
            System.out.println("Player One Wins");
        } else {
            System.out.println("Player Two Wins");
        }
    }
}