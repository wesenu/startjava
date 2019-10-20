class WolfTest {
	public static void main(String[] args) {
		Wolf myWolf = new Wolf();
		myWolf.setName("Sharik");
		myWolf.setSex("male");
		myWolf.setColor("yellow");
		myWolf.setAge(7);
		myWolf.setWeigth(2.50f);
		
		System.out.println("Wolf's name is " + myWolf.getName() + "\n"
			+ "He is " + myWolf.getColor() +  " " + myWolf.getSex() + "\n"
			+ "He is " + myWolf.getAge() + " years old" + "\n"
			+ "And he weights " + myWolf.getWeight() + " tons." + "\n");

		myWolf.go();
		myWolf.sit();
		myWolf.run();
		myWolf.howl();
		myWolf.hunt();
	}
}