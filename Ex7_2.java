import java.util.Arrays;
import java.util.Scanner;
public class Ex7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i ++) {
            System.out.println("Enter an integer, 10 in total.");
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(swap(a)));
    }
    public static int[] swap(int[] a) {
        int[] b = new int[a.length];
        for (int c = 0; c < a.length; c++) {
            b[c] = a[9-c];
    }
        return b;
}
}
