class Calculator {
	private static final String RESULT_STRING = "Result: ";
	private int result = -1;
	
	public void addition(int firstNumber, int secondNumber) {
		result = firstNumber + secondNumber;
		System.out.println(RESULT_STRING + result);
	}
	public void substraction(int firstNumber, int secondNumber) {
		result = firstNumber - secondNumber;
		System.out.println(RESULT_STRING + result);
	}
	public void multiplication(int firstNumber, int secondNumber) {
		result = firstNumber * secondNumber;
		System.out.println(RESULT_STRING + result);
	}
	public void division(int firstNumber, int secondNumber) {
		result = firstNumber / secondNumber;
		System.out.println(RESULT_STRING + result);
	}
	public void exponentiation(int firstNumber, int secondNumber) {
		result = 1;
		for (int i = 0; i < secondNumber; i++) {
			result *= firstNumber;
		}
		System.out.println(RESULT_STRING + result);
	}
	public void divisionByReminder(int firstNumber, int secondNumber) {
		result = firstNumber % secondNumber;
		System.out.println(RESULT_STRING + result);
	}
}