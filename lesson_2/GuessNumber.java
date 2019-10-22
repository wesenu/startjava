class GuessNumber {
	private final String GAME_CAPTION = "The computer has made up some number from 0 to 100, the game is about to start. (%d)\n";
	private final String GUESS_TRUE = "And %d is TRUE! %s has won this game! CONGRATULATIONS!!! \n";
	private final String GUESS_FALSE = "And %d is false... %s may be lucky next time \n";
	private Player playerOne; 
	private Player playerTwo;
	private int number;
	
	GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startNewGame() {
		number = makeNewNumber();
		System.out.println(String.format(GAME_CAPTION, number));
		System.out.println("The game has started!" + "\n");
	}

	private int makeNewNumber() {
		return (int) (Math.random() * 101);
	}

	public boolean checkAnotherMove(Player player) {
		if (this.number == player.getNumber()) {
			win(player);
			return true;
		} else {
			lose(player);
			return false;
		}
	}

	private void win(Player player) {
		System.out.println(String.format(GUESS_TRUE, player.getNumber(), player.getName()));
	}

	private void lose(Player player) {
		System.out.println(String.format(GUESS_FALSE, player.getNumber(), player.getName()));
	}
}