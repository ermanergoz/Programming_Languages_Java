package being;

public abstract class Being
{
    private int code;
    private String name;

    public Being(int _code, String _name)
    {
        this.code=_code;
        this.name=_name;
    }

	//Getters
	public int getCode()
	{
		return this.code;
	}
	public String getName()
	{
		return this.name;
	}
	
	//Setters
	public void setCode(int _code)
	{
		this.code=_code;
	}
	public void setName(String _name)
	{
		this.name=_name;
	}
}