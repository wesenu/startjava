package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private int guessNumber;
    private int attempt;
    private boolean isWin;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        init();
        guessNumber = generateGuessNumber();
        System.out.printf("\nThe computer has made up some guessNumber from 0 to 100, the game is started.\n\n");

        for (attempt = 0; attempt < 10; attempt++) {
            System.out.printf("%s is trying to guess the guessNumber! The guessNumber is... ", playerOne.getName());
            playerOne.addNumber(scanner.nextInt(), attempt);
            if (checkAnotherMove(playerOne)) {
                break;
            }

            System.out.printf("%s is trying to guess the guessNumber! The guessNumber is... ", playerTwo.getName());
            playerTwo.addNumber(scanner.nextInt(), attempt);
            if (checkAnotherMove(playerTwo)) {
                break;
            }
        }

        if (!isWin) {
            System.out.print(playerOne.getName() + " has used his all attempt. The numbers are ");
            printNumbers(playerOne);
            System.out.print(playerTwo.getName() + " has used his all attempt. The numbers are ");
            printNumbers(playerTwo);
            System.out.println("The right guessNumber was " + guessNumber);
        }
    }

    private void init() {
        isWin = false;
        if (attempt != 0) {
            playerOne.clearNumbers(attempt);
            playerTwo.clearNumbers(attempt);
            attempt = 0;
        }
    }

    private int generateGuessNumber() {
        return (int) (Math.random() * 101);
    }

    private boolean checkAnotherMove(Player player) {
        if (guessNumber == player.getNumber(attempt)) {
            System.out.printf("And %d is TRUE! %s has won this game! CONGRATULATIONS!!!\n\n", player.getNumber(attempt), player.getName());
            isWin = true;
            return true;
        } else {
            String hint = player.getNumber(attempt) > guessNumber ? "higher" : "less";
            System.out.printf("And %d is false... %s may be lucky next time. This number is %s than the guessed number."
                + "\n\n", player.getNumber(attempt), player.getName(), hint);
            return false;
        }
    }

    private void printNumbers(Player player) {
        int[] numbers = player.getNumbers(attempt);

        for (int number1 : numbers) {
            System.out.print(number1 + " ");
        }
        System.out.print("\n");
    }
}