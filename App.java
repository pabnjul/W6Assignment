package week06Assignment;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		
		Player player1 = new Player ("Jack");
		Player player2 = new Player ("Jill");
		
		deck.shuffle();
		
		//deal cards to players
		for (int i=0; i<52; i++ ) {
			if (i%2 == 0) {
				player1.drawCard(deck);
			} else {
				player2.drawCard(deck);
			}
		}
		//Using a traditional for loop, iterate 26 times and call the flip method for each player.

			
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
		//Compare the value of each card returned by the two player’s flip methods. 
		//Call the incrementScore method on the player whose card has the higher value.
		if (player1Card.getValue() > player2Card.getValue() ) {
			player1.incrementScore();
			}
		else if (player1Card.getValue() < player2Card.getValue()) {
			player2.incrementScore();
			}
		else {
			System.out.println("DRAW!");
		}
		//update on scores
		player1.describe();
		player2.describe();
	
	}
		//After the loop, compare the final score from each player
		System.out.println("************FINAL RESULTS************");
		player1.describe();
		player2.describe();
		if (player1.score > player2.score) {
			System.out.println(player1.name + " is the winner!");
		} else if (player1.score < player2.score) {
			System.out.println(player2.name + " is the winner!");
		} else {
			System.out.println("You're both losers (it's a draw).");
			
		}
	}
}

