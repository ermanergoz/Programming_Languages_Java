import beings.Kid;
import beings.OompaLoompa;
import model.GoldenTicket;
import model.Product;
import song.OompaLoompaSong;
import controller.FunctionLibrary;
import java.util.Scanner;

/*
1 - Register Prize tickets
2 - List all prize tickets
3 - List only raffled tickets
4 - Create a new Oompa Loompa song
5 - Register Beings
6 - Register Products
7 - Ruffle tickets
8 - Register sale
9 - List winners
*/

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int option;

        do
        {
            System.out.println("Press 0 to register Prize tickets\n" +
                    "Press 1 to list all prize tickets\n" +
                    "Press 2 to list only raffled tickets\n" +
                    "Press 3 to create a new Oompa Loompa song\n" +
                    "Press 4 to register the kids\n" +
                    "Press 5 to register oompaLoompas\n" +
                    "Press 6 to register products\n" +
                    "Press 7 to ruffle tickets\n" +
                    "Press 8 to register sale\n" +
                    "Press 9 to list winners" +
                    "Type 10 to quit");

            option = scanner.nextInt();

            switch(option)
            {
                case 1:
                    //TO DO
                    break;
                case 2:
                    new FunctionLibrary().listPrizeTickets();
                    break;
                case 3:
                    System.out.println("How many lines should it have?");
                    System.out.println(new OompaLoompaSong(scanner.nextInt()).sing());
                    break;
                case 4:
                    System.out.println("How many kids are there to register?");
                    new FunctionLibrary().registerKid(scanner.nextInt());
                    break;
				case 5:
					System.out.println("How many oompaloompas are there to register?");
                    new FunctionLibrary().registerOompaLoompa(scanner.nextInt());
                    break;
				case 6:
					System.out.println("How many products are there to register?");
                    new FunctionLibrary().registerProducts(scanner.nextInt());
                    break;
				case 7:
					System.out.println("How many tickets do you want to raffle?");
                    new FunctionLibrary().ruffleTickets(scanner.nextInt());
                    break;
				case 8:
					//TO DO
                    break;
				case 9:
					//TO DO
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Wrong option");
            }
        }
        while(true);
    }
}