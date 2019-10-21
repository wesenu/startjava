class JaegerTest {
	public static void main(String[] args) {
		Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "USA", 85.34f, 2.312f, 5, 7, 4);		
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

		Jaeger gripsyDanger = new Jaeger("Gripsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);
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