import java.io.*;
class Calculator {
	public static void main(String[] args) {
		boolean exit = false;
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
		while (!exit) {
			System.out.print("\n" + "Enter the number of operation you want to do" + "\n" 
				+ "1. Addition (+)" + "\n"
				+ "2. Substraction (-)" + "\n"
				+ "3. Multiplication (*)" + "\n"
				+ "4. Division (/)" + "\n"
				+ "5. Exponentation (^)"  + "\n"
				+ "6. Get the remainder of the division (%)" + "\n" 
				+ "Your choice: ");
			
			try {
				int choice = Integer.parseInt(consoleReader.readLine());		
				System.out.print("The first number = ");
				int firstNumber = Integer.parseInt(consoleReader.readLine());
				System.out.print("The second number = ");
				int secondNumber = Integer.parseInt(consoleReader.readLine());
				int resultingNumber = 0; 
		
				if (choice == 1) {
					resultingNumber = firstNumber + secondNumber;
				} else if (choice == 2) {
					resultingNumber = firstNumber - secondNumber;
				} else if (choice == 3) {
					resultingNumber = firstNumber * secondNumber;
				} else if (choice == 4) {
					resultingNumber = firstNumber / secondNumber;
				} else if (choice == 5) {
					resultingNumber = 1;
					for (int i = 0; i < secondNumber; i++) {
						resultingNumber *= firstNumber;
					}
				} else if (choice == 6) {
					resultingNumber = firstNumber % secondNumber;
				}
				System.out.println("Result: " + resultingNumber + "\n");

				System.out.println("Do you want to continue? " + "\n" 
					+ "Type Y to chose the operation again or just press any key.");
				String confirmation = consoleReader.readLine();
				if (!"Y".equals(confirmation)) {
					consoleReader.close();
					exit = true;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}