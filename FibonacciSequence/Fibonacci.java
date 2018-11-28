public class Fibonacci
{
	public static void main(String args[])
	{
		long Number1=0;
		long Number2=1;
			
		System.out.println(1);	
		for(int i=0;i<25;++i)
		{
			System.out.println(Number1=Number1+Number2);
			if(i!=24)						
				System.out.println(Number2=Number1+Number2);			
		}
	}
}