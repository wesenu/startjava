class ConditionalStatement {
	public static void main(String[] args) {
		int age = 24;		
		if (age > 20) {
			System.out.println("You're over 20 years old!");
		}

		boolean isMale = true;
		if (isMale) {
			System.out.println("You're a male. Congratulations.");
		}

		if (!isMale) {
			System.out.println("Unfortunately you're not a male");
		}

		double height = 1.83;
		if (height > 1.80) {
			System.out.println("You're taller than me. Maybe.");
		}

		char firstLetterOfName = 'I';
		if (firstLetterOfName == 'M') {
			System.out.println("For sure! I don't know what can I say here. You're exactly not me XD");
		} else if (firstLetterOfName == 'I') {
			System.out.println("Oh, your name may be the same as mine. Not sure about that.");
		} else {
			System.out.println("Like that?! Who are you, buddy?");
		}
	}
}