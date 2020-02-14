package chapter9txtbookexercises;

public class QuadraticEquation {
    private double a; 
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getC() {
        return c;
    }
    public double getB() {
        return b;
    }
    public double getA() {
        return a; 
    }
    public double getDiscriminant() {
        return (b * b - 4 * a * c);
    }
    public double getRoot1() { 
        if (getDiscriminant() >= 0) {
            return (-1 * b + Math.sqrt(getDiscriminant()))/2 * a;
        }
        else {
            return 0;
        }
    }
    public double getRoot2() { 
        if (getDiscriminant() >= 0) {
            return (-1 * b - Math.sqrt(getDiscriminant()))/2 * a;
        }
        else {
            return 0;
        }
    }
}