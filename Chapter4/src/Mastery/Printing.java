package Mastery;

import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number of copies to be printed: ");
	
	int copies = input.nextInt();
	
	
	double pricePerCopy;
	
	if (copies >= 0 && copies <=99) {
	pricePerCopy = 0.30;
	} else if (copies <= 499) {
		pricePerCopy = 0.28;
	} else if (copies <= 749) {
        pricePerCopy = 0.27;
    } else if (copies <= 1000) {
        pricePerCopy = 0.26;
    } else {
        pricePerCopy = 0.25;
    }
	 
	 double totalCost = copies * pricePerCopy;

	 System.out.printf("Price per copy is: $%.2f\n", + pricePerCopy);
     System.out.printf("Total cost is: $%.2f\n", + totalCost);
	
	
	input.close();
	
    	}
	
	}