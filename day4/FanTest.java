package day4;

public class FanTest {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.setRadius(10);
        f.setColor("Purple");
        f.setSpeed(Fan.FAST);
        f.setOn(true);
        System.out.println(f);
        Fan f2 = new Fan();
        f.setSpeed(Fan.MEDIUM);
        f.setRadius(5);
        f.setColor("Blue");
        System.out.println(f2);
    }
}