class Calculator {
	private int result = 0;
		
	public int calculate(int firstNumber, int secondNumber, char mathOperation) {
		switch(mathOperation) {
			case '+': result = addition(firstNumber, secondNumber); break; 
			case '-': result = substraction(firstNumber, secondNumber); break;
			case '*': result = multiplication(firstNumber, secondNumber); break;
			case '/': result = division(firstNumber, secondNumber); break;
			case '^': result = exponentiation(firstNumber, secondNumber); break; 
			case '%': result = divisionByReminder(firstNumber, secondNumber); break;
			default: System.out.println("Oops! Invalid math operation..." + "\n");
				return -1;
		}
		return result;
	}

	private int addition(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	private int substraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	private int multiplication(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	private int division(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	private int exponentiation(int firstNumber, int secondNumber) {
		result = 1;
		for (int i = 0; i < secondNumber; i++) {
			result *= firstNumber;
		}
		return result;
	}

	private int divisionByReminder(int firstNumber, int secondNumber) {
		return firstNumber % secondNumber;
	}
}