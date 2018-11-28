import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author Teuta Drini
 */
public class Input {
    private final ArrayList<Polygons> polyArray;

    Vector<Integer> topLeftX = new Vector();
    Vector<Integer> topLeftY = new Vector();
    Vector<Integer> bottomRightX = new Vector();
    Vector<Integer> bottomRightY = new Vector();
    Vector<Integer> res = new Vector();

    public Input(){
        polyArray = new ArrayList<>();
    }
    public void read(String filename) throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));

            Polygons obj=null;
            char typeOfTheShape=sc.next().charAt(0);
            int r= sc.nextInt();
            int x= sc.nextInt();
            int y=sc.nextInt();
            //String kind = sc.next();

            if(typeOfTheShape=='C')
            {
                obj = new Circle(r, x, y);
            }



            polyArray.add(obj);
        }
    }