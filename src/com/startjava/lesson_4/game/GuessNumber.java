package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private int number;
    private int attempt;
    private boolean isWin;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        number = makeNumber();
        isWin = false;
        attempt = 0;
        System.out.printf("\nThe computer has made up some number from 0 to 100, the game is started. (%d)\n\n", number);
        playerOne.clearNumbers();
        playerTwo.clearNumbers();

        for (attempt = 0; attempt < 10; attempt++) {
            System.out.printf("%s is trying to guess the number! The number is... ", playerOne.getName());
            playerOne.addNumber(scanner.nextInt(), attempt);
            if (checkAnotherMove(playerOne)) {
                break;
            }

            System.out.printf("%s is trying to guess the number! The number is... ", playerTwo.getName());
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
            System.out.println("The right number was " + number);
        }
    }

    private int makeNumber() {
        return (int) (Math.random() * 101);
    }

    private boolean checkAnotherMove(Player player) {
        if (number == player.getNumber(attempt)) {
            System.out.printf("And %d is TRUE! %s has won this game! CONGRATULATIONS!!!\n\n", player.getNumber(attempt), player.getName());
            isWin = true;
            return true;
        } else {
            System.out.printf("And %d is false... %s may be lucky next time \n\n", player.getNumber(attempt), player.getName());
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