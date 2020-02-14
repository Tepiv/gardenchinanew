package day1;

public class Point {
    public double x;
    public double y;

    public Point (double xCoord, double yCoord) {
        x = xCoord;
        y = yCoord;
    }
    
    public void translate (double dx, double dy) {
        x += dx;
        y += dy;
    }
    public void dilate (double factor) {
        x *= factor;
        y *= factor;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}  
