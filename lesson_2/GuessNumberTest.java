import java.util.Scanner;

class GuessNumberTest {
	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner(System.in);
		System.out.print("\nType your name, player one: ");
		Player playerOne = new Player(consoleScanner.nextLine());
		System.out.print("Type your name, player two: ");
		Player playerTwo = new Player(consoleScanner.nextLine());
		GuessNumber gameGuessNumber = new GuessNumber(playerOne, playerTwo);
		
		String choice;
		do {
			gameGuessNumber.startGame();
			do {
				System.out.println("Would you like to continue? [yes/no]");
				 choice = consoleScanner.nextLine();
			} while (!"yes".equals(choice) && !"no".equals(choice));
	
			System.out.print("\n");
		} while (!"no".equals(choice));
	}
}