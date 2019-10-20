class Wolf {
	int age;
	float weight;
	String name;
	String color;
	String sex;

	public void go() {
		System.out.println(name + " is going somewhere...");
	}

	public void sit() {
		System.out.println(name + " is sitting...");
	}

	public void run() {
		System.out.println(name + " is running...");
	}

	public void howl() {
		System.out.println("*" + name + "'s howling*");
	}

	public void hunt() {
		System.out.println("*" + name  + " is hunting... Looks scary, btw.*");
	}
}