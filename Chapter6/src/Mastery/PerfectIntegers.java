package Mastery;

public class PerfectIntegers {

	 public static boolean isPerfect(int number)
	    {
	        int sum = 0;

	        
	        for (int i = 1; i < number; i++)
	        {
	            if (number % i == 0)
	            {
	                sum = sum + i;
	            }
	        }

	       
	        if (sum == number)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }

	    public static void main(String[] args)
	    {
	        System.out.println("Perfect integers from 1 to 100:");
	        System.out.println();

	        
	        for (int number = 1; number <= 100; number++)
	        {
	            if (isPerfect(number))
	            {
	                System.out.println(number + " is a perfect integer.");
	            }
	        }
	    }
	}
	
	
	
	
	
	
	
	
	
	
	

