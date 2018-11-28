public class IsPrime
{
	public static boolean isItPrime(int number) 
	{      
        for (int i = 2; i <= number / 2; ++i) 
		{
            
            if (number % i == 0) 
			{
                return false;
            }
        }
        return true; 
    }
	
	public static void main(String args[])
	{         
        boolean isPrime = false; 
       
        for (int number = 100; number > 0; --number) 
		{
            isPrime = isItPrime(number);
            if (isPrime) 
			{
                System.out.println(number);
            }
        }       
    }  
}