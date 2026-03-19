package Mastery;

import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[]args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter a time
		
	
		
		System.out.print("Enter a time less than 4.5 sceonds:");
		
		double time = scanner.nextDouble();
		
		// Check if the time is valid
		
		if (time >= 0 && time < 4.5)
		{
			
			// Calculate the height
			// Formula: height = 100 - 4.9 * t^2
			
			double height = 100.0 - (4.9 * time * time);
			
			// Display the height of the object
			
			System.out.println("The height of the object is: " + height + "metres");
		} 
		
		else {
		
			
			System.out.println("Invalid input. Please enter a valid time between 0 and 4.5 Seconds:");
			
			
		}
	
	
	
	
	
	}
	
}
	