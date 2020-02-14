import java.util.Arrays;
public class Ex7_19 {
    public static void isSorted(int[] list) {
        int[] b = new int[list.length];
        int a = list.length;
        for (int c = 0; c < b.length; c++) {
            b[c] = list[c];
        }
        int d = 0;
        boolean lessThan = true;
        while (d<b.length - 1 && lessThan == true) {
            if (b[d] <= b[d+1]) {
                lessThan = true;
            }
            else {
                lessThan = false;
            }
            d ++;
        }
        if (lessThan == true) {
            System.out.println("The list has " + a + " integers" + Arrays.toString(b));
            System.out.println("The list is sorted.");
        }
        else {
            System.out.println("The list has " + a + " integers" + Arrays.toString(b));
            System.out.println("The list is not sorted.");
        }
    }
    
    public static void main(String[] args) {
      System.out.println("#1");
      isSorted(new int[]{4,7, 19, 21, 44, 98, 101});
  
      System.out.println("\n#2");
      isSorted(new int[]{4,7, 54, 15, 19, 21, 44, 98, 101});
  
      System.out.println("\n#3");
      isSorted(new int[]{-2, 0, 3});
    }
  }