class ConditionalStatement {
	public static void main(String[] args) {
		int age = 24;
		boolean isMale = true;
		double height = 1.83;
		char firstLetterOfYourName = 'I';

		if (age > 20) {
			System.out.println("You're over 20 years old!");
		}

		if (isMale) {
			System.out.println("You're a male. Congratulations.");
		}

		if (!isMale) {
			System.out.println("Unfortunately you're not a male");
		}

		if (height > 1.80) {
			System.out.println("You're taller than me. Maybe.");
		}

		if (firstLetterOfYourName == 'M') {
			System.out.println("For sure! I don't know what can I say here. You're exactly not me XD");
		} else if (firstLetterOfYourName == 'I') {
			System.out.println("Oh, your name may be the same as mine. Not sure about that.");
		} else {
			System.out.println("Like that?! Who are you, buddy?");
		}
	}
}