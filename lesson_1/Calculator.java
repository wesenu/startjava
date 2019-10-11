class Calculator {
	public static void main(String[] args) {
		boolean exit = false;
		char choice = '%';		
		int firstNumber = 20;
		int secondNumber = 4;
		int resultingNumber = 0; 
		
		if (choice == '+') {
			resultingNumber = firstNumber + secondNumber;
		} else if (choice == '-') {
			resultingNumber = firstNumber - secondNumber;
		} else if (choice == '*') {
			resultingNumber = firstNumber * secondNumber;
		} else if (choice == '/') {
			resultingNumber = firstNumber / secondNumber;
		} else if (choice == '^') {
			resultingNumber = 1;
			for (int i = 0; i < secondNumber; i++) {
				resultingNumber *= firstNumber;
			}
		} else if (choice == '%') {
			resultingNumber = firstNumber % secondNumber;
		}
		System.out.println("Result: " + resultingNumber + "\n");	
	}
}