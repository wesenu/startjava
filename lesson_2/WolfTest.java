class WolfTest {
	public static void main(String[] args) {
		Wolf myWolf = new Wolf();
		myWolf.name = "Sharik";
		myWolf.sex = "male";
		myWolf.color = "yellow";
		myWolf.age = 10;
		myWolf.weight = 2.50f;
		
		System.out.println("Wolf's name is " + myWolf.name + "\n"
			+ "He is " + myWolf.color +  " " + myWolf.sex + "\n"
			+ "He is " + myWolf.age + " years old" + "\n"
			+ "And he weights " + myWolf.weight + " tons." + "\n");

		myWolf.go();
		myWolf.sit();
		myWolf.run();
		myWolf.howl();
		myWolf.hunt();
	}
}