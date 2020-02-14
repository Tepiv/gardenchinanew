public class Locker {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[101];
        for (int s = 1; s <= 100; s ++) {

            for (int i = s; i <= 100; i += s) {
                lockers[i] = !lockers[i];
            }
        }
        for (int l = 0;  l <= 100; l ++) {
            if (lockers[l]) {
                System.out.println(l);
            }
        } 
    }
}