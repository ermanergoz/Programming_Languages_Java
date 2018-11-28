public class myClass
{
	public static void main (String args[])
	{
		Person p=new Person("Osman","Killibacak",30);

		
		
		String myAttribute="friend";
		System.out.println("Hello "+myAttribute);
		/*
		p.setName("osman");
		p.setFamilyName("killibacak");
		p.setAge(30);
		*/
		//System.out.println(p.getName() + " " + p.getFamilyName() + " " + p.getAge());
		System.out.println(p);
	}
}