package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nType your name, player one: ");
        Player playerOne = new Player(scanner.nextLine());
        System.out.print("Type your name, player two: ");
        Player playerTwo = new Player(scanner.nextLine());
        GuessNumber gameGuessNumber = new GuessNumber(playerOne, playerTwo);

        String choice;
        do {
            gameGuessNumber.startGame();
            do {
                System.out.println("Would you like to continue? [yes/no]");
                choice = scanner.nextLine();
            } while (!"yes".equals(choice) && !"no".equals(choice));

            System.out.print("\n");
        } while (!"no".equals(choice));
    }
}
