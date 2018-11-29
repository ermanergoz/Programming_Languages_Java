import beings.Kid;
import beings.OompaLoompa;
import model.GoldenTicket;
import model.Product;
import song.OompaLoompaSong;

public class Main
{
    public static void main(String args[])
    {
        OompaLoompaSong song = new OompaLoompaSong(3);

        System.out.println(song.sing());
    }
}