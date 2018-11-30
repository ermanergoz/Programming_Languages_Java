package beings;
import model.Product;
import java.util.*;

public class Kid extends Beings
{
    private String birthday;
    private List<Product> purchasedProducts;
    String placeOfBirth;

    //Constructor
    public Kid (int _code, String _name, String _birthday, List<Product> _purchasedProducts, String _placeOfBirth)
    {
        super(_code, _name);

        this.birthday = _birthday;
        this.purchasedProducts = _purchasedProducts;
        this.placeOfBirth = _placeOfBirth;
    }

    //Getters
    public String getBirthday()
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
    public void setBirthday(String _birthday)
    {
        this.birthday=_birthday;
    }
    public void setListOfPurchasedProducts(List<Product> _purchasedProducts)
    {
        this.purchasedProducts=_purchasedProducts;

    }
    public void setPlaceOfBirth(String _placeOfBirth)
    {
        this.placeOfBirth=_placeOfBirth;
    }
}