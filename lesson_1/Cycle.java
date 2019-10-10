class Cycle {
	public static void main(String[] args) {
		int number = 6;
		int sum = 0;
		
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		while (number >= -6) {
			System.out.print(number + " ");
			number -= 2;
		}
		System.out.println("\n");

		number = 10;
		do {
			if (number % 2 != 0) {
				sum += number;
			}

			number += 1;
		} while (number <= 20);
		System.out.print("Total sum is " + sum); 
	}
}