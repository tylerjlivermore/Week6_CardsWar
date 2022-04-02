package week6FinalProject;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		//Receive and set user input for player names
		Scanner enterName = new Scanner(System.in);
		System.out.print("Please Enter Player 1 Name: ");
		String playerName = enterName.next();
		player1.setPlayer(playerName);

		System.out.print("Please Enter Player 2 Name: ");
		playerName = enterName.next();
		player2.setPlayer(playerName);
		enterName.close();
		//scanner closed to avoid leak. Must be after all inputs completed or else exception on the 2nd input b/c the System.in is closed
		
		deck.shuffle();
		
		//divvy out the players' hands
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {	//using modulus to alternate draws as even/odd turns
				player1.draw(deck);
			} else if (i % 2 != 0) {
				player2.draw(deck);
			}
		}
		
		//run each round of War, increment score for each round winner +1
		for (int j = 0; j < 26; j++) {
			int player1Card = player1.flip();
			int player2Card = player2.flip();
			
			if (player1Card > player2Card) {
				player1.incrementScore();
				
			} else if (player2Card > player1Card) {
				player2.incrementScore();
			}
		}
		
		player1.getScore();
		player2.getScore();
		System.out.println(player1.getPlayerName() + ": " + player1.getScore());
		System.out.println(player2.getPlayerName() + ": " + player2.getScore());
		
		//compare final scores
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getPlayerName() + " wins!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getPlayerName() + " wins!");
		} else {
			System.out.println("The game ends in a draw.");
		}
	}
}