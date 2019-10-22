class Player {
	private int guessNumber;
	private String name;

	Player(String name) {
		this.name = name;
	}

	public int getNumber() {
		return guessNumber;
	}

	public void setNumber(int guessNumber) {
		this.guessNumber = guessNumber;
	}

	public String getName() {
		return name;
	}	
}