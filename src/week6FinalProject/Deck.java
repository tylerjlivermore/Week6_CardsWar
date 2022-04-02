package week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Deck {
	private Map <String, Integer> cards;
	private List <String> shuffledCards;

		public Deck() {	//create the 52 standard cards
			//Hearts
			Card card1 = new Card();
			card1.setCard("Two of Hearts", 2);
			Card card2 = new Card();
			card2.setCard("Three of Hearts", 3);
			Card card3 = new Card();
			card3.setCard("Four of Hearts", 4);
			Card card4 = new Card();
			card4.setCard("Five of Hearts", 5);
			Card card5 = new Card();
			card5.setCard("Six of Hearts", 6);
			Card card6 = new Card();
			card6.setCard("Seven of Hearts", 7);
			Card card7 = new Card();
			card7.setCard("Eight of Hearts", 8);
			Card card8 = new Card();
			card8.setCard("Nine of Hearts", 9);
			Card card9 = new Card();
			card9.setCard("Ten of Hearts", 10);
			Card card10 = new Card();
			card10.setCard("Jack of Hearts", 11);
			Card card11 = new Card();
			card11.setCard("Queen of Hearts", 12);
			Card card12 = new Card();
			card12.setCard("King of Hearts", 13);
			Card card13 = new Card();
			card13.setCard("Ace of Hearts", 14);
			//Spades
			Card card14 = new Card();
			card14.setCard("Two of Spades", 2);
			Card card15 = new Card();
			card15.setCard("Three of Spades", 3);
			Card card16 = new Card();
			card16.setCard("Four of Spades", 4);
			Card card17 = new Card();
			card17.setCard("Five of Spades", 5);
			Card card18 = new Card();
			card18.setCard("Six of Spades", 6);
			Card card19 = new Card();
			card19.setCard("Seven of Spades", 7);
			Card card20 = new Card();
			card20.setCard("Eight of Spades", 8);
			Card card21 = new Card();
			card21.setCard("Nine of Spades", 9);
			Card card22 = new Card();
			card22.setCard("Ten of Spades", 10);
			Card card23 = new Card();
			card23.setCard("Jack of Spades", 11);
			Card card24 = new Card();
			card24.setCard("Queen of Spades", 12);
			Card card25 = new Card();
			card25.setCard("King of Spades", 13);
			Card card26 = new Card();
			card26.setCard("Ace of Spades", 14);
			//Diamonds
			Card card27 = new Card();
			card27.setCard("Two of Diamonds", 2);
			Card card28 = new Card();
			card28.setCard("Three of Diamonds", 3);
			Card card29 = new Card();
			card29.setCard("Four of Diamonds", 4);
			Card card30 = new Card();
			card30.setCard("Five of Diamonds", 5);
			Card card31 = new Card();
			card31.setCard("Six of Diamonds", 6);
			Card card32 = new Card();
			card32.setCard("Seven of Diamonds", 7);
			Card card33 = new Card();
			card33.setCard("Eight of Diamonds", 8);
			Card card34 = new Card();
			card34.setCard("Nine of Diamonds", 9);
			Card card35 = new Card();
			card35.setCard("Ten of Diamonds", 10);
			Card card36 = new Card();
			card36.setCard("Jack of Diamonds", 11);
			Card card37 = new Card();
			card37.setCard("Queen of Diamonds", 12);
			Card card38 = new Card();
			card38.setCard("King of Diamonds", 13);
			Card card39 = new Card();
			card39.setCard("Ace of Diamonds", 14);
			//Clubs
			Card card40 = new Card();
			card40.setCard("Two of Clubs", 2);
			Card card41 = new Card();
			card41.setCard("Three of Clubs", 3);
			Card card42 = new Card();
			card42.setCard("Four of Clubs", 4);
			Card card43 = new Card();
			card43.setCard("Five of Clubs", 5);
			Card card44 = new Card();
			card44.setCard("Six of Clubs", 6);
			Card card45 = new Card();
			card45.setCard("Seven of Clubs", 7);
			Card card46 = new Card();
			card46.setCard("Eight of Clubs", 8);
			Card card47 = new Card();
			card47.setCard("Nine of Clubs", 9);
			Card card48 = new Card();
			card48.setCard("Ten of Clubs", 10);
			Card card49 = new Card();
			card49.setCard("Jack of Clubs", 11);
			Card card50 = new Card();
			card50.setCard("Queen of Clubs", 12);
			Card card51 = new Card();
			card51.setCard("King of Clubs", 13);
			Card card52 = new Card();
			card52.setCard("Ace of Clubs", 14); //52 = have all the cards
			
			cards = Map.ofEntries(
				/*populate a map of the 52 cards, value linked to name(key)
				*Map use allows lookup of values by methods later in the program
				name is the key b/c of uniqueness vs. duplicate values*/
				Map.entry(card1.getCardName(), card1.getCardValue()),
				Map.entry(card2.getCardName(), card2.getCardValue()),
				Map.entry(card3.getCardName(), card3.getCardValue()), 
				Map.entry(card4.getCardName(), card4.getCardValue()),
				Map.entry(card5.getCardName(), card5.getCardValue()),
				Map.entry(card6.getCardName(), card6.getCardValue()), 
				Map.entry(card7.getCardName(), card7.getCardValue()),
				Map.entry(card8.getCardName(), card8.getCardValue()), 
				Map.entry(card9.getCardName(), card9.getCardValue()),
				Map.entry(card10.getCardName(), card10.getCardValue()),
				Map.entry(card11.getCardName(), card11.getCardValue()), 
				Map.entry(card12.getCardName(), card12.getCardValue()),
				Map.entry(card13.getCardName(), card13.getCardValue()),
				Map.entry(card14.getCardName(), card14.getCardValue()),
				Map.entry(card15.getCardName(), card15.getCardValue()),
				Map.entry(card16.getCardName(), card16.getCardValue()), 
				Map.entry(card17.getCardName(), card17.getCardValue()),
				Map.entry(card18.getCardName(), card18.getCardValue()),
				Map.entry(card19.getCardName(), card19.getCardValue()), 
				Map.entry(card20.getCardName(), card20.getCardValue()),
				Map.entry(card21.getCardName(), card21.getCardValue()), 
				Map.entry(card22.getCardName(), card22.getCardValue()),
				Map.entry(card23.getCardName(), card23.getCardValue()),
				Map.entry(card24.getCardName(), card24.getCardValue()), 
				Map.entry(card25.getCardName(), card25.getCardValue()),
				Map.entry(card26.getCardName(), card26.getCardValue()),
				Map.entry(card27.getCardName(), card27.getCardValue()),
				Map.entry(card28.getCardName(), card28.getCardValue()),
				Map.entry(card29.getCardName(), card29.getCardValue()), 
				Map.entry(card30.getCardName(), card30.getCardValue()),
				Map.entry(card31.getCardName(), card31.getCardValue()),
				Map.entry(card32.getCardName(), card32.getCardValue()), 
				Map.entry(card33.getCardName(), card33.getCardValue()),
				Map.entry(card34.getCardName(), card34.getCardValue()), 
				Map.entry(card35.getCardName(), card35.getCardValue()),
				Map.entry(card36.getCardName(), card36.getCardValue()),
				Map.entry(card37.getCardName(), card37.getCardValue()), 
				Map.entry(card38.getCardName(), card38.getCardValue()),
				Map.entry(card39.getCardName(), card39.getCardValue()),
				Map.entry(card40.getCardName(), card40.getCardValue()),
				Map.entry(card41.getCardName(), card41.getCardValue()),
				Map.entry(card42.getCardName(), card42.getCardValue()), 
				Map.entry(card43.getCardName(), card43.getCardValue()),
				Map.entry(card44.getCardName(), card44.getCardValue()),
				Map.entry(card45.getCardName(), card45.getCardValue()), 
				Map.entry(card46.getCardName(), card46.getCardValue()),
				Map.entry(card47.getCardName(), card47.getCardValue()), 
				Map.entry(card48.getCardName(), card48.getCardValue()),
				Map.entry(card49.getCardName(), card49.getCardValue()),
				Map.entry(card50.getCardName(), card50.getCardValue()), 
				Map.entry(card51.getCardName(), card51.getCardValue()),
				Map.entry(card52.getCardName(), card52.getCardValue())
			);	
		}
	
	public void shuffle() {	
		//Card names from Map moved into a List for calling indexes, values called later from Map by name
		List<String> shuffledCards = new ArrayList<>(cards.keySet());
		this.shuffledCards = shuffledCards;
		Collections.shuffle(shuffledCards);	//shuffle method used from imported Collections library
	}
	//select top card of shuffled deck and then remove
	public String draw() {
		String drawnCard = shuffledCards.get(0);
		shuffledCards.remove(0);
		return drawnCard;
	}
	//lookup card value in Map table
	public Integer retrieveValue(String cardName) {
		return cards.get(cardName);
	}
}