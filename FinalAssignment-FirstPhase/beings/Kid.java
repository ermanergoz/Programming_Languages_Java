package beings;
import java.util.Date;

public class Kid extends Beings
{
	private Date birthday;
	private List<String> purchasedProducts;
	String placeOfBirth;
	
	public Kid (int _code, String _name, Date _birthday, List<String> _purchasedProducts, String _placeOfBirth)
	{
		super(_code, _name);
		
		this.birthday = _birthday;
		this.purchasedProducts = _purchasedProducts;
		this.placeOfBirth = _placeOfBirth;
	}
}