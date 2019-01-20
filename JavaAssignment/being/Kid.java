package being;
import model.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Kid extends Being
{
    private Date birthday;
    private List<Product> purchasedProducts/*=new ArrayList<>()*/;
    String placeOfBirth;

    //Constructor
    public Kid (int _code, String _name, String _birthday, List<Product> _purchasedProducts, String _placeOfBirth)
    {

        super(_code, _name);
        this.purchasedProducts=new ArrayList<Product>();

        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            this.birthday=timeFormat.parse(_birthday);
        }
        catch(ParseException err)
        {
            System.out.println("parse error");
        }

        //this.birthday = _birthday;
        this.purchasedProducts = _purchasedProducts;
        this.placeOfBirth = _placeOfBirth;
    }

    //Getters
    public Date getBirthday()
    {
        return this.birthday;
    }
    public List<Product> getListOfPurchasedProducts()
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
            this.purchasedProducts=new ArrayList<Product>();

        this.purchasedProducts.add(product);
    }
}