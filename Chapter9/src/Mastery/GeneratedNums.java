package Mastery;

public class GeneratedNums {
	 
	
	public static void main(String[] args)
	    {
	        
	        int[] numbers = new int[101];

	        
	        for (int i = 0; i < numbers.length; i++)
	        {
	            int sumDigits = 0;
	            int temp = i;

	           
	            while (temp > 0)
	            {
	                sumDigits += temp % 10;
	                temp = temp / 10;
	            }

	           
	            numbers[i] = i + sumDigits;
	        }

	        
	        System.out.println("Index\tGenerated Number");

	       
	        for (int i = 0; i < numbers.length; i++)
	        {
	            System.out.println(i + "\t" + numbers[i]);
	        }
	    }
	}

