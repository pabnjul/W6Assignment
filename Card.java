package week06Assignment;

import java.util.ArrayList;
import java.util.List;

public class Card {
	public int value;
	public String name;
	
	//describe the card, using value and corresponding name
	//need list, getters/setters
	//values from 2-14, 
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	
	public void describe () {
		System.out.println("Card " + value + " " + name);
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
