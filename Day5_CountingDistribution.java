import java.util.Scanner;
public class Day5_CountingDistribution {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[11];
        System.out.println("Enter numbers between 1 and 10, end with a 0.");
        int indexa = input.nextInt();
        while (indexa != 0) {
            a[indexa] += 1;
            System.out.println("Enter numbers between 1 and 10, end with a 0.");
            indexa = input.nextInt();
        }
        for (int i = 1; i < 10; i ++) {
            if (a[i] != 0) {
                System.out.println(i + ":" + a[i]);
            }
        }  
        input.close();
    }
}