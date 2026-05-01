package Mastery;

public class Investment {

	
	 public static void main(String[] args) {

	        double investment = 2500.0;
	        double rate = 0.075; // 7.5%
	        int years = 0;

	        // Loop until investment reaches at least $5000
	        while (investment < 5000) {
	            investment = investment + (investment * rate);
	            years++;
	        }

	        System.out.println("It will take " + years + " years for the investment to reach at least $5000.");
	        System.out.printf("Final amount: $%.2f\n", investment);
	    }
	}
	
	
	
	
	
	

