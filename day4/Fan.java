package day4;

public class Fan {
    public static final String SPEEDS[] ={"", "Slow", "Medium", "Fast"};
    public static final int SLOW = 1; 
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on; 
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        color = "blue";
        radius = 5;
    }

    public String toString() {
        String r = "";
        if (on) {
            r = "Speed: " + SPEEDS[speed] + "; Color: " + color + "; Radius: " + radius;
        }
        else {
            r = "Color: " + color + "; Radius: " + radius + "; The fan is off.";
        }
        return r;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public void setOn (boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
}