package controller;

import beings.Kid;
import beings.OompaLoompa;
import model.GoldenTicket;
import model.Product;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class FunctionLibrary
{
    List<Kid> kidList = new ArrayList <>();

    public void registerKid(int code, String name, Date birthday, List<Product> purchasedProducts, String placeOfBirth, int howMany)
    {
        for(int ctr=0; ctr<howMany; ++ctr)
        {
            Kid kid = new Kid(code, name, birthday, purchasedProducts, placeOfBirth);
            kidList.add(kid);
        }
    }


    List<OompaLoompa> oompaLoompaList = new ArrayList <>();

    public void registerOompaLoompa(int code, String name, int height, String favoriteFood, int howMany)
    {
        for(int ctr=0; i<howMany; ++ctr)
        {
            OompaLoompa oompaLoompa = new OompaLoompa(code, name, height, favoriteFood);
            oompaLoompaList.add(oompaLoompa);
        }
    }

    List<Product> productList = new ArrayList <>();

    public void registerProducts(String description, long barcode, String serialNumber, GoldenTicket prizeTicket, int howMany)
    {
        for(int ctr=0; ctr<howMany; ++ctr)
        {
            Product product = new Product(description, barcode, serialNumber, prizeTicket);
            productList.add(product);
        }
    }

    public void registerSale(Kid kid)
    {
        int userCode = 123;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Type user code to proceed: ");
        int userCodeInput = userInput.nextInt();

        if(userCodeInput==userCode)
        {
            System.out.println("Type product barcode: ");
            long barcode = userInput.nextLong();
            int randomizedProductIndex=0;

            Random rand = new Random();
            while(productList.get(randomizedProductIndex).getBarcode()!=barcode)
            {
                randomizedProductIndex = rand.nextInt(productList.size()-1);
            }

            kid.getListOfPurchasedProducts().add(productList.get(randomizedProductIndex));
            productList.remove(randomizedProductIndex);

        }
        else
            System.out.println("you messed up");
    }
}