class Calculator {
	public static void main(String[] args) {
		char mathOperation = '*';		
		int firstNumber = 20;
		int secondNumber = 4;
		int result = 0; 
		
		if (mathOperation == '+') {
			result = firstNumber + secondNumber;
		} else if (mathOperation == '-') {
			result = firstNumber - secondNumber;
		} else if (mathOperation == '*') {
			result = firstNumber * secondNumber;
		} else if (mathOperation == '/') {
			result = firstNumber / secondNumber;
		} else if (mathOperation == '^') {
			result = 1;
			for (int i = 0; i < secondNumber; i++) {
				result *= firstNumber;
			}
		} else if (mathOperation == '%') {
			result = firstNumber % secondNumber;
		}
		System.out.println("Result: " + result);	
	}
}