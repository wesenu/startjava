class Calculator {
	private static final String RESULT_STRING = "Result: ";
	private int result = -1;
	
	public void doOperation(int firstNumber, int secondNumber, char mathOperation) {
		switch(mathOperation) {
				case '+': addition(firstNumber, secondNumber); break;
				case '-': substraction(firstNumber, secondNumber); break;
				case '*': multiplication(firstNumber, secondNumber); break;
				case '/': division(firstNumber, secondNumber); break;
				case '^': exponentiation(firstNumber, secondNumber); break;
				case '%': divisionByReminder(firstNumber, secondNumber); break;
				default: System.out.println("Oops! Invalid math operation..." + "\n");
			}
	}
	private void addition(int firstNumber, int secondNumber) {
		result = firstNumber + secondNumber;
		System.out.println(RESULT_STRING + result);
	}
	private void substraction(int firstNumber, int secondNumber) {
		result = firstNumber - secondNumber;
		System.out.println(RESULT_STRING + result);
	}
	private void multiplication(int firstNumber, int secondNumber) {
		result = firstNumber * secondNumber;
		System.out.println(RESULT_STRING + result);
	}
	private void division(int firstNumber, int secondNumber) {
		result = firstNumber / secondNumber;
		System.out.println(RESULT_STRING + result);
	}
	private void exponentiation(int firstNumber, int secondNumber) {
		result = 1;
		for (int i = 0; i < secondNumber; i++) {
			result *= firstNumber;
		}
		System.out.println(RESULT_STRING + result);
	}
	private void divisionByReminder(int firstNumber, int secondNumber) {
		result = firstNumber % secondNumber;
		System.out.println(RESULT_STRING + result);
	}
}