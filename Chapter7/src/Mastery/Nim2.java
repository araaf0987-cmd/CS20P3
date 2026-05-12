package Mastery;

import java.util.Random;
import java.util.Scanner;

public class Nim2 {
	 private int stones;
	    private Random random = new Random();
	    private Scanner input = new Scanner(System.in);

	    public Nim2() {
	        stones = random.nextInt(16) + 15;
	    }

	    public void playerTurn() {

	        System.out.println("\nYour Turn");
	        System.out.println("Stones left: " + stones);

	        System.out.print("Take 1, 2, or 3 stones: ");
	        int take = input.nextInt();

	        while (take < 1 || take > 3 || take > stones) {
	            System.out.println("Invalid move. Try again.");
	            System.out.print("Take 1, 2, or 3 stones: ");
	            take = input.nextInt();
	        }

	        stones -= take;

	        System.out.println("You took " + take + " stone(s).");
	    }

	    public void computerTurn() {

	        System.out.println("\nComputer's Turn");

	        int maxTake = Math.min(3, stones);

	        int take = random.nextInt(maxTake) + 1;

	        stones -= take;

	        System.out.println("Computer took " + take + " stone(s).");
	        System.out.println("Stones left: " + stones);
	    }

	    public void playGame() {

	        System.out.println("Welcome to Nim2!");
	        System.out.println("Starting stones: " + stones);

	        while (stones > 0) {

	            playerTurn();

	            if (stones == 0) {
	                System.out.println("\nYou took the last stone.");
	                System.out.println("You lose!");
	                break;
	            }

	            computerTurn();

	            if (stones == 0) {
	                System.out.println("\nComputer took the last stone.");
	                System.out.println("You win!");
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {

	        Nim2 game = new Nim2();
	        game.playGame();
	    }
	}

