import java.util.Scanner;

class GuessNumberTest {
	public static void main(String[] args) {
		final String GUESS_ATTEMPT = "%s is trying to guess the number! The number is... ";
		Scanner consoleScanner = new Scanner(System.in);
		GuessNumber gameGuessNumber;
		Player playerOne, playerTwo;
		String choice;

		System.out.print("Type your name, player one: ");
		playerOne = new Player(consoleScanner.nextLine());
		System.out.print("Type your name, player two: ");
		playerTwo = new Player(consoleScanner.nextLine());
		gameGuessNumber = new GuessNumber(playerOne, playerTwo);

		do {
			gameGuessNumber.startNewGame();
			while(true) {
				System.out.print(String.format(GUESS_ATTEMPT, playerOne.getName()));
				playerOne.setNumber(consoleScanner.nextInt());
				if (gameGuessNumber.checkAnotherMove(playerOne))
					break;	

				System.out.print(String.format(GUESS_ATTEMPT, playerTwo.getName()));
				playerTwo.setNumber(consoleScanner.nextInt());
				if (gameGuessNumber.checkAnotherMove(playerTwo))
					break;	
			}

			consoleScanner.nextLine();
			do {
				System.out.println("Would you like to continue? [yes/no]");
				choice = consoleScanner.nextLine();
			} while (!"yes".equals(choice) && !"no".equals(choice));
	
			System.out.print("\n");
			if ("no".equals(choice))
				break;
		} while (true);
	}
}