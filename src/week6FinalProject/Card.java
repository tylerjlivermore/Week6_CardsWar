package week6FinalProject;

public class Card {
	private int value;		//2-14 (2-Ace)
	private String name;	//Ace of Diamonds,  etc.

	public void setCard(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public int getCardValue() {
		int cardValue = this.value;
		return cardValue;
	}
	
	public String getCardName() {
		String cardName = this.name;
		return cardName;
	}

	public void describe() {
		System.out.println("(" + getCardValue() + ") " + getCardName());
	}
}