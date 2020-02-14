public class Average {
    public static void main (String[] args) {
        double a = average (15,14,25);
        System.out.println(a);
        String b = duplicator("Ham", 4);
        System.out.println(b);
    }
    public static String duplicator (String str, int b) {
        String out = "";
        for (int c = 0; c < b; c +=1) {
            out += str;
        }
        return out;
    }
    public static double average (int a, int b, int c) {
    double average = (a + b + c) / 3.0;
    return average;
    }
}

