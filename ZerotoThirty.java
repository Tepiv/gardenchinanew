public class ZerotoThirty {
    public static void main (String[] args) {
        int[] count = new int[10];

    for (int i=0; i < 500000; i++) {
        int num = (int)(10 * Math.random());
        count[num] = count[num] + 1;        
    }
    for (int i=0; i <10; i++) {
        System.out.println(i + ": " + count[i]);
    }
}
}