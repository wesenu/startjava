import java.util.Scanner;
class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		String choice = "";
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		char mathOperation = ' ';

		do {
			System.out.print("\n" + "Type the first unmber: ");
			firstNumber = scanner.nextInt();
			System.out.print("Choose math operation: ");
			mathOperation = scanner.next().charAt(0);
			System.out.print("Type the second number: ");
			secondNumber = scanner.nextInt();
			result = calculator.calculate(firstNumber, secondNumber, mathOperation);
			System.out.println("Result: " + result);
			do {
				System.out.print("Do you want to continue? [yes / no] - ");
				choice = scanner.nextLine();
			} while (!"no".equals(choice) && !"yes".equals(choice));
		} while (!"no".equals(choice));

	}
}