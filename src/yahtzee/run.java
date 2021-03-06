package yahtzee;

public class run {
	public static void main(String[] args) {

		// Game Setup
		
		YahtzeeGame game = new YahtzeeGame();

		// UI for beginning game.
		// TODO take input of players, configure ot game.start()
		//game.startList(new Player("Bob"),new Player("Bill")/*,new Player("Mary"),new Player("Chris"),new Player("Anne")*/);
		System.out.println("How many players?");
		Player[] players = new Player[TextIO.getlnInt()];
		System.out.println("Please state their names one by one.");
		for (int i=0;i<players.length;i++) players[i] = new Player(TextIO.getln());
		game.start(players);



		// Gameplay

		// While last person's scorecard isn't full
		while (!game.getPlayers()[game.getPlayerNum()-1].isFull()) {
			System.out.println("Now beginning turn #"+game.getTurn());
			game.turn();
			System.out.println("Turn #"+game.getTurn()+" is over. The current scores are:\n"+game.getFormattedScores());
		}

		// Ending
		
		game.over();
	}
}
