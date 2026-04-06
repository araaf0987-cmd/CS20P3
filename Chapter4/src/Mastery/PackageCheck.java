package Mastery;

import java.util.Scanner;


public class PackageCheck {

	 public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);

		 System.out.print("Enter package weight in kg: ");
	        double weight = input.nextDouble();

	        System.out.print("Enter package length in centimetres: ");
	        double length = input.nextDouble();

	        System.out.print("Enter package width in centimetres: ");
	        double width = input.nextDouble();
	
	        System.out.print("Enter package height in centimetres: ");
	        double height = input.nextDouble();
	
	
	        boolean tooHeavy = weight > 27;
	        boolean tooLarge = (length > 100) || (width > 100) || (height > 100);

	        
	        if (tooHeavy && tooLarge) {
	            System.out.println("Too heavy and too large");
	        } else if (tooHeavy) {
	            System.out.println("Too heavy");
	        } else if (tooLarge) {
	            System.out.println("Too large");
	        } else {
	            System.out.println("Package is acceptable");
	        }

	        input.close();
	
	
	 }
	
}
