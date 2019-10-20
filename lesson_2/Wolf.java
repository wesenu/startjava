class Wolf {
	private int age;
	private float weight;
	private String name;
	private String color;
	private String sex;

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

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorrect age");
		} else {
			this.age = age;
		}
	}

	public void setWeigth(float weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return this.age;
	}

	public float getWeight() {
		return this.weight;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public String getSex() {
		return this.sex;
	}
}