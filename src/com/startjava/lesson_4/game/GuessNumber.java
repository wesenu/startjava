package com.startjava.lesson_4.game;

import java.util.Scanner;

class GuessNumber {
    private Scanner consoleScanner = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private int number;
    private int attempts;
    private boolean isWinner;

    GuessNumber(Player playerOne, Player playerTwo, int attempts) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.attempts = attempts;
        playerOne.setAttempts(attempts);
        playerTwo.setAttempts(attempts);
    }

    public void startGame() {
        number = makeNumber();
        isWinner = false;
        System.out.printf("\nThe computer has made up some number from 0 to 100, the game is started. (%d)\n\n", number);

        for (int i = attempts; i > 0; i--) {
            System.out.printf("%s is trying to guess the number! The number is... ", playerOne.getName());
            playerOne.addNumber(consoleScanner.nextInt());
            if (checkAnotherMove(playerOne)) {
                break;
            }
            
            System.out.printf("%s is trying to guess the number! The number is... ", playerTwo.getName());
            playerTwo.addNumber(consoleScanner.nextInt());
            if (checkAnotherMove(playerTwo)) {
                break;
            }
        }

        if (!isWinner) {
            playerOne.printAttempts();
            playerTwo.printAttempts();
            System.out.println("The right number was " + number);
        }
    }

    private int makeNumber() {
        return (int) (Math.random() * 101);
    }

    private boolean checkAnotherMove(Player player) {
        if (number == player.getLastNumber()) {
            System.out.printf("And %d is TRUE! %s has won this game! CONGRATULATIONS!!!\n\n", player.getLastNumber(), player.getName());
            isWinner = true;
            return true;
        } else {
            System.out.printf("And %d is false... %s may be lucky next time \n\n", player.getLastNumber(), player.getName());
            return false;
        }
    }
}