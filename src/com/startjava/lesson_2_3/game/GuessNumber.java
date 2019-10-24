package com.startjava.lesson_2_3.game;

import java.util.Scanner;

class GuessNumber {
	private Scanner consoleScanner = new Scanner(System.in);	
	private Player playerOne; 
	private Player playerTwo;
	private int number;
	
	GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
		number = makeNumber();
		System.out.printf("\nThe computer has made up some number from 0 to 100, the game is started. (%d)\n\n", number);
		
		while(true) {
			System.out.printf("%s is trying to guess the number! The number is... ", playerOne.getName());
			playerOne.setNumber(consoleScanner.nextInt());	
			if (checkAnotherMove(playerOne)) {
				break;	
			}

			System.out.printf("%s is trying to guess the number! The number is... ", playerTwo.getName());
			playerTwo.setNumber(consoleScanner.nextInt());
			if (checkAnotherMove(playerTwo)) {
				break;	
			}
		}	
	}

	private int makeNumber() {
		return (int) (Math.random() * 101);
	}

	public boolean checkAnotherMove(Player player) {
		if (number == player.getNumber()) {
			System.out.printf("And %d is TRUE! %s has won this game! CONGRATULATIONS!!!\n\n", player.getNumber(), player.getName());
			return true;
		} else {
			System.out.printf("And %d is false... %s may be lucky next time \n\n", player.getNumber(), player.getName());
			return false;
		}
	}
}