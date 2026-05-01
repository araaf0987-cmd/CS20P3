package Mastery;


import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }

        System.out.print("\nEnter the first number: ");
        int start = input.nextInt();

        System.out.print("Enter the second number: ");
        int end = input.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int n = start; n <= end; n++) {
            boolean prime = true;

            if (n <= 1) {
                prime = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.print(n + " ");
            }
        }

        input.close();
    }
}
	
	
	
	
	
	
	
	
	

