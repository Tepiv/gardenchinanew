package day1;

public class Tester {
   public static void main(String[] args) {
       Point p1 = new Point(12, 3);
       Point p2 = new Point(4, 23);
       Point p3 = new Point(8, -12);

       /*p2.translate(1, -1);
       System.out.println(p2);
    
       Rectangle r = new Rectangle(4, -2, 5, 16);
       System.out.println(r);
       System.out.println(r.p1);
       System.out.println(r.getArea());
       r.translate(3, -2);
       System.out.println(r);*/


       Rectangle r2 = new Rectangle(p1, p2);
       Rectangle r3 = new Rectangle (p2, p3);
       System.out.println("Area r2; " + r2.getArea());
       System.out.println("Area r3: " + r3.getArea());

       r3.setPoint1(p1);
       r2.dilate(2);
       System.out.println("Area r2: " + r2.getArea());
       System.out.println("Area r3: " + r3.getArea());
    }
}