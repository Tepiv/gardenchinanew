import java.util.Scanner;
public class Day1_Average {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers would you like to enter?");
        int size = input.nextInt();
        int[] number = new int[size];

        System.out.println("Enter the numbers");
        for (int i = 0; i < number.length; i ++) {
            number[i] = input.nextInt();
        }
        int sum = 0;
        for (int b = 0; b < number.length; b ++) {
            sum += number[b];
        }
        int average = sum / number.length;
        int more = 0;
        int less = 0;
        for (int c = 0; c < number.length; c ++);
        if (number[c] < average) {
            more ++;
        }
        else {
            less ++;
        }
        System.out.println ("Average: " + average);
        System.out.println ("# Above Average: " + more);
        System.out.println ("# Below Average: " + less);
    }
}
