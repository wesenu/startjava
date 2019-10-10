class Cycle {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		int number = 6;
		while (number >= -6) {
			System.out.print(number + " ");
			number -= 2;
		}
		System.out.println("\n");

		number = 10;
		int sumOdd = 0;
		do {
			if (number % 2 != 0) {
				sumOdd += number;
			}
			number++;
		} while (number <= 20);
		System.out.print("Total sum of odds is " + sumOdd); 
	}
}