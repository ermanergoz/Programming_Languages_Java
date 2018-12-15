package beings;
import model.Product;
import java.util.*;

public class Kid extends Beings
{
    private String birthday;
    private List<Product> purchasedProducts/*=new ArrayList<>()*/;
    String placeOfBirth;

    //Constructor
    public Kid (int _code, String _name, String _birthday, List<Product> _purchasedProducts, String _placeOfBirth)
    {

        super(_code, _name);
        this.purchasedProducts=new ArrayList<>();
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
    public void addPurchasedProduct(Product product)
    {
        if(purchasedProducts==null)
            this.purchasedProducts=new ArrayList<>();

        this.purchasedProducts.add(product);
    }
}