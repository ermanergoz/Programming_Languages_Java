import java.io.FileNotFoundException;
/**
 *
 * @author Teuta Drini
 */
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Input in = new Input();
        try {
            in.read("input.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            System.exit(-1);
            //} catch (InvalidInputException ex) {
            //System.out.println("Invalid input!");
            //System.exit(-1);
        }
        //in.report();
        //System.out.println(in.minBoundingBox());

    }
}
