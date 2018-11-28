import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author Teuta Drini
 */
public abstract class Polygons {
    protected int radius;
    protected int xAxis;
    protected int yAxis;
    private String kind;



    public Polygons(int radius, int xAxis, int yAxis){
        this.radius=radius;
        this.xAxis=xAxis;
        this.yAxis=yAxis;
    }
    public int getX() {
        return xAxis;
    }

    public void setX(int x) {
        this.xAxis = x;
    }

    public int getY() {
        return yAxis;
    }

    public void setY(int y) {
        this.yAxis= y;
    }
    public String getKind() {
        return kind;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int r) {
        this.radius =r;
    }
    public String toString() {
        return "radius: " + radius + " ( " + xAxis + ",  " + yAxis + " )";
    }

    public void calcCord(Polygons polygon, Vector<Integer> topLeftX, Vector<Integer> topLeftY, Vector<Integer> bottomRightX, Vector<Integer> bottomRightY)
    {
        //Method to calculate the bounding box
        topLeftX.add(polygon.xAxis+polygon.radius/2);
        topLeftY.add(polygon.yAxis+polygon.radius/2);

        bottomRightX.add(polygon.xAxis-polygon.radius/2);
        bottomRightY.add(polygon.yAxis-polygon.radius/2);

    }

    public Vector<Integer> minBoundingBox(Vector<Integer> topLeftX, Vector<Integer> topLeftY, Vector<Integer> bottomRightX, Vector<Integer> bottomRightY)
    {
        Collections.sort(topLeftX);
        Collections.sort(topLeftY);
        Collections.sort(bottomRightX);
        Collections.sort(bottomRightY);

        Vector<Integer> result = new Vector(5);

        result.add(topLeftX.elementAt(topLeftX.size()-1));
        result.add(topLeftY.elementAt(topLeftY.size()-1));

        result.add(bottomRightX.elementAt(0));
        result.add(bottomRightY.elementAt(0));

        return result;
    }


}
