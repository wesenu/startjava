class Calculator {	
	public int calculate(int firstNumber, int secondNumber, char mathOperation) {
		switch(mathOperation) {
			case '+': return add(firstNumber, secondNumber); 
			case '-': return substract(firstNumber, secondNumber); 
			case '*': return multiply(firstNumber, secondNumber); 
			case '/': return divide(firstNumber, secondNumber); 
			case '^': return exponentiate(firstNumber, secondNumber); 
			case '%': return divideByReminder(firstNumber, secondNumber); 
			default: System.out.println("Oops! Invalid math operation..." + "\n");
				return -1;
		}
	}

	private int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	private int substract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	private int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	private int divide(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	private int exponentiate(int firstNumber, int secondNumber) {
		int result = 1;
		for (int i = 0; i < secondNumber; i++) {
			result *= firstNumber;
		}
		return result;
	}

	private int divideByReminder(int firstNumber, int secondNumber) {
		return firstNumber % secondNumber;
	}
}