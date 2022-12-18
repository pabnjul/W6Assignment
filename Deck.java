package week06Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//all 52 cards
	//build a deck
	List<Card> cards = new ArrayList<Card>();
	
	public Deck () {
		for (int i = 0; i < 52; i++) {
			
		}
		
		
	

	//for loop cycles through each suit, assign value to each--switch case, could do method 
	//save 52 for app class, modulo
	
	private List<Card> createFourSuits(int value, String num) {
		List<Card> newList = new ArrayList<Card>();
		
		for (int i =0; i<4; i++) {
			Card newCard = new Card(i, num);	
			newCard.setValue(value);
			switch (i) {
				case(0): 
					newCard.setName(num+ " of Hearts");
					newList.add(newCard);
					break;
				case(1): 
					newCard.setName(num+ " of Diamonds");
					newList.add(newCard);
					break;
				case(2): 
					newCard.setName(num+ " of Clubs");
					newList.add(newCard);
					break;
				case(3): 
					newCard.setName(num+ " of Spades");
					newList.add(newCard);
					break;
			}
		}
		return newList;
		
	}

	private void populateDeck(List<Card> cards) {	
		for (int i=2; i<=14; i++) {
			switch (i) {
			case (2): 
				cards.addAll(createFourSuits(i,"Two"));
				break;
			case (3):
				cards.addAll(createFourSuits(i,"Three"));
				break;
			case (4):
				cards.addAll(createFourSuits(i,"Four"));
				break;
			case (5):
				cards.addAll(createFourSuits(i,"Five"));
				break;			
			case (6):
				cards.addAll(createFourSuits(i,"Six"));
				break;	
			case (7):
				cards.addAll(createFourSuits(i,"Seven"));
				break;	
			case (8):
				cards.addAll(createFourSuits(i,"Eight"));
				break;	
			case (9):
				cards.addAll(createFourSuits(i,"Nine"));
				break;	
			case (10):
				cards.addAll(createFourSuits(i,"Ten"));
				break;	
			case (11):
				cards.addAll(createFourSuits(i,"Jack"));
				break;	
			case (12):
				cards.addAll(createFourSuits(i,"Queen"));
				break;	
			case (13):
				cards.addAll(createFourSuits(i,"King"));
				break;	
			case (14):
				cards.addAll(createFourSuits(i,"Ace"));
				break;
			}
	
		}
			
	}

		public List<Card> getCards(){
			return cards;
		}
		public void setCards(List<Card> cards) {
			this.cards = cards;
		}
	
	//randomize the order of the cards, save into temp list
	public void shuffle() {
		Collections.shuffle(cards);
		
		
	}
	//draw-- returns top of card 
	public Card draw () {
		if (cards.isEmpty()) {
			return null;
		} else {
		Card topCard = cards.get(0);
		cards.remove(0);
		topCard.describe();
		return topCard;
	} 
	
	}
}

