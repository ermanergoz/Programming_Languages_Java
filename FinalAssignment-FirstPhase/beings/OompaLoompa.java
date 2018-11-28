package beings;

public class OompaLoompa extends Beings
{
	private int height;
	private String favoriteFood;
	
	public OompaLoompa (int _code, String _name, int _height, String _favoriteFood)
	{
		super(_code, _name);
		
		this.height=_height;
		this.favoriteFood=_favoriteFood;
	}
}