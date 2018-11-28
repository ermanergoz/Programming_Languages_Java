public class MyClass
{
	//int i=10;	//this wont work in from public static void main 
	
	public static int/*it returns int*/ sum(int numA, int numB)
	{
		return numA+numB;
	}
	
	public static void main (String args[])
	{
		int i=0;
		int j=10;
		System.out.println(sum(i,j));
	}
}