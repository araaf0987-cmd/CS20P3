package Mastery;

import java.util.Random;
import java.util.Scanner;

public class GameOf21 {
	 private Random random = new Random();
	    private Scanner input = new Scanner(System.in);

	    public int dealCard() {
	        return random.nextInt(13) + 1;
	    }

	    public int cardValue(int card) {

	        if (card >= 11 && card <= 13) {
	            return 10;
	        }

	        if (card == 1) {
	            return 11;
	        }

	        return card;
	    }

	    public String cardName(int card) {

	        switch (card) {
	            case 1:
	                return "Ace";
	            case 11:
	                return "Jack";
	            case 12:
	                return "Queen";
	            case 13:
	                return "King";
	            default:
	                return String.valueOf(card);
	        }
	    }

	    public void playRound() {

	        int playerTotal = 0;
	        int computerTotal = 0;

	        
	        int card1 = dealCard();
	        int card2 = dealCard();

	        playerTotal += cardValue(card1);
	        playerTotal += cardValue(card2);

	        System.out.println("Your cards are:");
	        System.out.println(cardName(card1));
	        System.out.println(cardName(card2));

	       
	        System.out.print("Do you want a third card? (yes/no): ");
	        String choice = input.nextLine();

	        if (choice.equalsIgnoreCase("yes")) {

	            int card3 = dealCard();

	            System.out.println("Your third card is: " + cardName(card3));

	            playerTotal += cardValue(card3);
	        }

	        
	        int comp1 = dealCard();
	        int comp2 = dealCard();

	        computerTotal += cardValue(comp1);
	        computerTotal += cardValue(comp2);

	       
	        if (computerTotal < 17) {

	            int comp3 = dealCard();

	            computerTotal += cardValue(comp3);
	        }

	       
	        if (playerTotal > 21 && (card1 == 1 || card2 == 1)) {
	            playerTotal -= 10;
	        }

	        if (computerTotal > 21 && (comp1 == 1 || comp2 == 1)) {
	            computerTotal -= 10;
	        }

	        System.out.println("\nYour total: " + playerTotal);
	        System.out.println("Computer total: " + computerTotal);

	       
	        if (playerTotal > 21) {
	            System.out.println("You went over 21. You lose!");
	        }
	        else if (computerTotal > 21) {
	            System.out.println("Computer went over 21. You win!");
	        }
	        else if (playerTotal > computerTotal) {
	            System.out.println("You win!");
	        }
	        else if (computerTotal > playerTotal) {
	            System.out.println("Computer wins!");
	        }
	        else {
	            System.out.println("It's a tie!");
	        }
	    }

	    public void startGame() {

	        String again = "yes";

	        while (again.equalsIgnoreCase("yes")) {

	            playRound();

	            System.out.print("\nPlay again? (yes/no): ");
	            again = input.nextLine();
	        }

	        System.out.println("Thanks for playing!");
	    }

	    public static void main(String[] args) {

	        GameOf21 game = new GameOf21();
	        game.startGame();
	    }
	}
	

