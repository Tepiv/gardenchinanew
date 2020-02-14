import java.util.Scanner;
public class Day3_Distinct {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nums = new int[10];
    int count = 0;

    System.out.println("Enter some numbers.");
    int n = input.nextInt();
    while (n != 0) {
        boolean found = false;
        for (int z = 0; z < count; z +=1) {
            if (nums[z] == n) {
                found = true;
            }
        }

        if (found == false) {
            n = nums[count];
            count += 1;
        }

        n = input.nextInt();
    }
    for(int i = 0; i < count; i +=1) {
        System.out.println(nums[i]);
    }
    input.close();
}
}