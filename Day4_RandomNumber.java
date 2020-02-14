public class Day4_RandomNumber {
    public static int getRandomNumber (int min, int max) {
        int width = max - min + 1;
        return (int)(Math.random() * width) + min;
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i ++) {
            System.out.println(getRandomNumber(3, 7));
        }
    }
}