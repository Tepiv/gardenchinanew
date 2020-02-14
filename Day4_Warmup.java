import java.util.Arrays;

public class Day4_Warmup {
       public static void subtractOne (int[] numb) {
            for (int a = 0; a < numb.length; a += 1) {
                numb[a] -= 1;
            }
       }
       public static void main(String[] args) {
           int[] a = {4, 19, 21, 7};
           subtractOne(a);
           System.out.println(Arrays.toString(a));
       }
        
    }
