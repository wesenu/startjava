class Wolf {
	private int age;
	private float weight;
	private String name;
	private String color;
	private String sex;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorrect age");
		} else {
			this.age = age;
		}
	}

	public float getWeight() {
		return weight;
	}

	public void setWeigth(float weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

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