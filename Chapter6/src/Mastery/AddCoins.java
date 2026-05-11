package Mastery;

import java.util.Scanner;

public class AddCoins {

	 
    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters)
    {
        double total;

       
        total = (pennies * 0.01) +
                (nickels * 0.05) +
                (dimes * 0.10) +
                (quarters * 0.25);

       
        return String.format("$%.2f", total);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int pennies;
        int nickels;
        int dimes;
        int quarters;

        System.out.println("Enter your total coins:");

        System.out.print("Quarters: ");
        quarters = input.nextInt();

        System.out.print("Dimes: ");
        dimes = input.nextInt();

        System.out.print("Nickels: ");
        nickels = input.nextInt();

        System.out.print("Pennies: ");
        pennies = input.nextInt();

       
        String totalAmount = getDollarAmount(pennies, nickels, dimes, quarters);

        System.out.println();
        System.out.println("Total: " + totalAmount);
    }
}
	
	

