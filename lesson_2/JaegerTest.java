class JaegerTest {
	public static void main(String[] args) {
		Jaeger coyoteTango = new Jaeger();
		coyoteTango.setModelName("Coyote Tango");
		coyoteTango.setMark("Mark-1");	
		coyoteTango.setOrigin("Japan");
		coyoteTango.setHeight(85.34f);
		coyoteTango.setWeight(2.312f);
		coyoteTango.setSpeed(5);
		coyoteTango.setStrength(7);
		coyoteTango.setArmor(4);

		System.out.println("Another robot is " + coyoteTango.getModelName() + "\n"
			+ "Mark: " + coyoteTango.getMark() + "\n"
			+ "Origin: " + coyoteTango.getOrigin() + "\n"
			+ "Height: " + coyoteTango.getHeight() + "\n"
			+ "Weight:" + coyoteTango.getWeight() + "\n"
			+ "Speed: " + coyoteTango.getSpeed() + "\n"
			+ "Strength: " + coyoteTango.getStrength() + "\n"
			+ "Armor: " + coyoteTango.getArmor() + "\n");
		coyoteTango.drift();
		coyoteTango.move();
		coyoteTango.scanKaiju();
		coyoteTango.useVortexCannon();

		Jaeger gripsyDanger = new Jaeger();
		gripsyDanger.setModelName("Gripsy Danger");
		gripsyDanger.setMark("Mark-3");	
		gripsyDanger.setOrigin("USA");
		gripsyDanger.setHeight(79.25f);
		gripsyDanger.setWeight(1.980f);
		gripsyDanger.setSpeed(7);
		gripsyDanger.setStrength(8);
		gripsyDanger.setArmor(6);

		System.out.println("\n" + "Another robot is " + gripsyDanger.getModelName() + "\n"
			+ "Mark: " + gripsyDanger.getMark() + "\n"
			+ "Origin: " + gripsyDanger.getOrigin() + "\n"
			+ "Height: " + gripsyDanger.getHeight() + "\n"
			+ "Weight:" + gripsyDanger.getWeight() + "\n"
			+ "Speed: " + gripsyDanger.getSpeed() + "\n"
			+ "Strength: " + gripsyDanger.getStrength() + "\n"
			+ "Armor: " + gripsyDanger.getArmor() + "\n");
		gripsyDanger.drift();
		gripsyDanger.move();
		gripsyDanger.scanKaiju();
		gripsyDanger.useVortexCannon();
	}
}