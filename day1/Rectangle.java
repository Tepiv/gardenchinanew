package day1;

public class Rectangle {
    private Point p1;
    private Point p2;

    public Rectangle (double x1, double y1, double x2, double y2) {
        p1 = new Point (x1, y1);
        p2 = new Point (x2, y2);
    }
    public Rectangle (Point p1, Point p2) {
        this.p1 = new Point (p1.x, p1.y);
        this.p2 = new Point (p2.x, p2.y);
    }
    public double getWidth() {
       return Math.abs(p1.x - p2.x);
    }
    public double getHeight() {
        return Math.abs(p1.y-p2.y);
    }
    public double getArea() {
        return getWidth()*getHeight();
    }
    public double getPerimeter() {
        return 2*getWidth() + 2*getHeight();
    }
    public String toString() {
        return "Rectangle: " + p1 + "," + p2;
    }
    public void translate (double dx, double dy) {
    p1.translate(dx, dy);
    p2.translate(dx, dy);
    }
    public void dilate (double factor) {
        p1.dilate(factor);
        p2.dilate(factor);
    }
    public Point getPoint1() {
        return new Point(p1.x, p1.y);
    }
    public Point getPoint2() {
        return new Point(p2.x, p2.y);
    }
    public void setPoint1(Point p) {
        p1 = new Point (p.x, p.y);
    }
    public void setPoint2(Point p) {
        p2 = newPoint(p.x, p.y);
    }
}