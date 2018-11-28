package beings;
import java.util.Date;
import java.util.*;

public class Kid extends Beings
{
    private Date birthday;
    private List<String> purchasedProducts;
    String placeOfBirth;

    //Constructor
    public Kid (int _code, String _name, Date _birthday, List<String> _purchasedProducts, String _placeOfBirth)
    {
        super(_code, _name);

        this.birthday = _birthday;
        this.purchasedProducts = _purchasedProducts;
        this.placeOfBirth = _placeOfBirth;
    }

    //Getters
    public Date getBirthday()
    {
        return this.birthday;
    }
    public List getListOfPurchasedProducts()
    {
        return this.purchasedProducts;

    }
    public String getPlaceOfBirth()
    {
        return this.placeOfBirth;
    }

    //Setters
    public void setBirthday(Date _birthday)
    {
        this.birthday=_birthday;
    }
    public void setListOfPurchasedProducts(List<String> _purchasedProducts)
    {
        this.purchasedProducts=_purchasedProducts;

    }
    public void setPlaceOfBirth(String _placeOfBirth)
    {
        this.placeOfBirth=_placeOfBirth;
    }
}