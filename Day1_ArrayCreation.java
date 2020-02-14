public class Day1_ArrayCreation {
    public static void main (String[] args) {
        int[] b = {15, 12, 2, 9};
        System.out.println("Length: " + b.length);
        System.out.println(b[1]);
        int[] a = new int[10];
        a[8] = 12;
        a[1] = 14;
        for (int i = 0; i < a.length; i ++) {
            System.out.println(i + " : " + a[i]);
        }
    }
}
