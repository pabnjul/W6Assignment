package week06Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//all 52 cards
	public List<Card> hand = new ArrayList<Card>();
	Integer score;
	String name;
	
	public Player (String name) {
		this.score = 0;
		this.name = name;
	}
	//use describe method from card
	public void describe() {
		System.out.println("Player " + name + "'s score is " + score);
		for (Card a: hand) {
			a.describe();
		}
	}
	//removes and returns the top card of the Hand
	public Card flip () {
		Card flipped = hand.get(0);
		hand.remove(0);
		System.out.println("Flipped: ");
		flipped.describe();
		return flipped;
	}
	//takes a Deck as an argument and calls the draw method on 
	//the deck, adding the returned Card to the hand field
	public void drawCard (Deck a) {
		Card drawn = a.draw();
		hand.add(drawn);
		System.out.println("Added the card " + drawn + " to " + name + "'s hand");
	}
	
	//adds one more point to player's amount
	public void incrementScore () {
		this.score++;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
