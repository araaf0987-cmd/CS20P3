package Mastery;

public class EvensAndOdds {

	public static void main(String[] args)
    {
        
        int[] numbers = new int[25];

       
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = (int)(Math.random() * 100);
        }

       
        System.out.println("ODD:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 != 0)
            {
                System.out.print(numbers[i] + " ");
            }
        }

        
        System.out.println();

       
        System.out.println("EVEN:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
	
	
	
	

