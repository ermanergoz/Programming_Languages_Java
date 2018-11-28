public class Person
{
	//Attributes
	private String name;
	private String familyName;
	private int age;
	
	//Constructors	
	//Empty Constructor
	public Person()
	{}
	//Constructor with arguements
	public Person(String name, String familyName)
	{
		this.name=name;
		this.familyName=familyName;
	}
	
	public Person(String name, String familyName, int age)
	{
		
		this.name=name;
		this.familyName=familyName;
		
		
		this.age=age;
	}
	//Getters and setters	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getFamilyName()
	{
		return familyName;
	}
	
	public void setFamilyName(String familyName)
	{
		this.familyName=familyName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	//custom methods
	public String fullName()
	{
		return name+" "+familyName;
	}
	@Override
	public String toString()
	{
		return "name: "+name+" " + "familyName: "+familyName+" "+"age: "+age;
	}
}