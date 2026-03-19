package Mastery;

import java.util.Scanner;

public class PizzaCost {

	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 // Prompt the user for the diameter
		 
		 System.out.print("Please enter the diameter of your pizza in inches:");
		 
		 // Read the diameter
		 
		 double diameter = scanner.nextDouble();
		 
		 // The standard formula for the problem is:
		 // Labor cost = $0.75, Rent cost = $1.00 -> Base Cost = $1.75
		 //Materials cost = $0.05 * diameter * diameter
		 
		 double baseCost = 1.75;
		 double materialCost = 0.05 * diameter * diameter; 
		 
		 double totalCost = baseCost + materialCost;
		 
		 //Display the output formatted exactly as requested
		 
		 System.out.printf("the cost of making the pizza is $%.2f\n", totalCost);
		 
		 scanner.close();
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	 
}
