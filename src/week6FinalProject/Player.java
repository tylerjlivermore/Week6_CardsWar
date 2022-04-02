package week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List <String> hand;
	private int score = 0;

	public Player() {
		List<String> hand = new ArrayList<>();
		this.hand = hand;
	}
	
	public void describe() {
		System.out.println(name);
		System.out.println(score);
	}
	
	
	public void setPlayer(String name) {
		this.name = name;
	}
	
	public String getPlayerName() {
		return this.name;
	}
	
	public int getScore() {
		return score;
	}
	
	//build up the player's cards with loop in Main
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Integer flip() {
		//select top card of hand and remove after
		String cardFromHand = hand.get(0);
		hand.remove(0);
		Deck deck = new Deck();
		//look up card value by name
		return deck.retrieveValue(cardFromHand);
	}
	
	public void incrementScore() {
		this.score++;
	}
}