package beings;

public class OompaLoompa extends Beings
{
	private int height;
	private String favoriteFood;
	
	//Constructor
	public OompaLoompa (int _code, String _name, int _height, String _favoriteFood)
	{
		super(_code, _name);
		
		this.height = _height;
		this.favoriteFood = _favoriteFood;
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
	public int getHeight()
	{
		return this.height;
	}
	public String getFavoriteFood()
	{
		return this.favoriteFood;
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
	public void setHeight(int _height)
	{
		this.height=_height;
	}
	public void setFavoriteFood(String _favoriteFood)
	{
		this.favoriteFood=_favoriteFood;
	}
}