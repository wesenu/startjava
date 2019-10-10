import java.io.*;
public class MyFirstGame {
	public static void main(String[] args) {
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
		int guessedNumber = 85; 
		boolean exit = false;
		int typedNumber = 0;

		System.our.println("Type any number")
		while (!exit) {
			try {
				typedNumber = Integer.parseInt(consoleReader.readLine());
				if (typedNumber > guessedNumber) {
					System.out.println("Your number is greater than what the computer selected.");
				} else if (typedNumber < guessedNumber) {
					System.out.println("Your number is less than what the computer made.");
				} else {
					System.out.println("You guessed!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("That's not a number. Try again please.");
			}
		}
	}
}