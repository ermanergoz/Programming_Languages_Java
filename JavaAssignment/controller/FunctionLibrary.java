package controller;

import beings.Kid;
import beings.OompaLoompa;
import model.GoldenTicket;
import model.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class FunctionLibrary
{
    List<Kid> kidList = new ArrayList <>();

    public void registerKid(/*List<Product> purchasedProducts,*/  int howMany)
    {
        Scanner userInput = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String birthday="";

        int code;
        // String name="";
        String placeOfBirth="";

        for(int ctr=0; ctr<howMany; ++ctr)
        {
            System.out.println("Type code of the kid: ");
            code=userInput.nextInt();

            userInput.nextLine();   //it is a workaround so it wont skip the input after nextInt()

            System.out.println("Type name of the kid: ");
            String name=userInput.nextLine();

            System.out.println("Type birthday of the kid (dd/MM/yyyy): ");
            birthday=userInput.nextLine();
            try
            {
                Date birthdayDate = dateFormat.parse(birthday);
            } catch (ParseException e)
            {
                e.printStackTrace();
            }

            System.out.println("Type birth place of the kid: ");
            placeOfBirth=userInput.nextLine();


            Kid kid = new Kid(code, name, birthday, null, placeOfBirth);
            kidList.add(kid);
        }
    }

    List<OompaLoompa> oompaLoompaList = new ArrayList <>();

    public void registerOompaLoompa(int howMany)
    {
        Scanner userInput = new Scanner(System.in);

        int code;
        String name="";
        int height;
        String favoriteFood="";

        for(int ctr=0; ctr<howMany; ++ctr)
        {
            System.out.println("Type code of oompaloompa: ");
            code=userInput.nextInt();
            userInput.nextLine();   //it is a workaround so it wont skip the input after nextInt()

            System.out.println("Type name of oompaloompa: ");
            name=userInput.nextLine();

            System.out.println("Type height of oompaloompa: ");
            height=userInput.nextInt();
            userInput.nextLine();

            System.out.println("Type favorite food of oompaloompa: ");
            favoriteFood=userInput.nextLine();

            OompaLoompa oompaLoompa = new OompaLoompa(code, name, height, favoriteFood);
            oompaLoompaList.add(oompaLoompa);
        }
    }

    List<Product> productList = new ArrayList <>();

    public void registerProducts(int howMany)
    {
        Scanner userInput = new Scanner(System.in);

        String description="";
        long barcode;
        String serialNumber="";

        for(int ctr=0; ctr<howMany; ++ctr)
        {
            System.out.println("Type description of the product: ");
            description=userInput.nextLine();

            System.out.println("Type barcode of the product: ");
            barcode=userInput.nextLong();
            userInput.nextLine();

            System.out.println("Type serial number of the product: ");
            serialNumber=userInput.nextLine();

            Product product = new Product(description, barcode, serialNumber, null);
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

            Random randomIndex = new Random();
            while(productList.get(randomizedProductIndex).getBarcode()!=barcode)
            {
                randomizedProductIndex = randomIndex.nextInt(productList.size()-1);
            }

            kid.getListOfPurchasedProducts().add(productList.get(randomizedProductIndex));
            productList.remove(randomizedProductIndex);
        }
        else
            System.out.println("you messed up");
    }

    public String codeGenerator()
    {
        String charList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random randomIndex = new Random();
        int randomizedCharIndex;
        String code ="";

        while(code.length()<11)
        {
            randomizedCharIndex = randomIndex.nextInt(charList.length()-1);
            code+=(charList.charAt(randomizedCharIndex));
        }
        return code;
    }

    public void ruffleTickets(int howMany)
    {
        Random randomIndex = new Random();
        int randomizedTicketIndex;

        for(int ctr=0; ctr<howMany; ++ctr)
        {
            Date ruffleDate = new Date();
            String code = codeGenerator();
            GoldenTicket goldenTicket = new GoldenTicket(code,ruffleDate);

            randomizedTicketIndex = randomIndex.nextInt(productList.size()-1);
            productList.get(randomizedTicketIndex).prizeTicketSetter(goldenTicket);
        }
    }
}