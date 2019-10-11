public class MyFirstGame {
	public static void main(String[] args) {
		int guessedNumber = 85; 
		int playerNumber = 91;
		boolean isExit = false;
		while (!isExit) {
			if (playerNumber > guessedNumber) {
				System.out.println("Your number is greater than what the computer selected.");
				playerNumber -= 15;
			} else if (playerNumber < guessedNumber) {
				System.out.println("Your number is less than what the computer made.");
				playerNumber += 31;
			} else {
				System.out.println("You guessed!");
				isExit = true;
			}
		}
	}
}