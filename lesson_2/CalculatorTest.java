import java.util.Scanner;
class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		String choice = "";
		int firstNumber = 0;
		int secondNumber = 0;
		char mathOperation = ' ';

		do {
			System.out.print("\n" + "Type the first unmber: ");
			firstNumber = scanner.nextInt();
			System.out.print("Choose math operation: ");
			mathOperation = scanner.next().charAt(0);
			System.out.print("Type the second number: ");
			secondNumber = scanner.nextInt();
			
			switch(mathOperation) {
				case '+': calculator.addition(firstNumber, secondNumber); break;
				case '-': calculator.substraction(firstNumber, secondNumber); break;
				case '*': calculator.multiplication(firstNumber, secondNumber); break;
				case '/': calculator.division(firstNumber, secondNumber); break;
				case '^': calculator.exponentiation(firstNumber, secondNumber); break;
				case '%': calculator.divisionByReminder(firstNumber, secondNumber); break;
				default: System.out.println("Oops! Invalid math operation..." + "\n");
			}

			do {
				System.out.print("Do you want to continue? [yes / no] - ");
				choice = scanner.nextLine();
			} while ( !("no".equals(choice) || "yes".equals(choice)) );
		} while (!"no".equals(choice));

	}
}