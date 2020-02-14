import java.util.Scanner;
public class Ex7_1 {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students.");
        int students = input.nextInt();
        int[] score = new int[students];
        int highscore = 0;
        for (int i = 0; i < score.length; i ++) {
            System.out.println("Enter student " + i + "'s score");
            score[i] = input.nextInt();
            if (score[i] > highscore) {
                highscore = score[i];
            }
        }
        for (int i = 0; i < score.length; i ++) {
            if (score[i] >= highscore - 10) {
                System.out.println("Student " + i + "'s score is: " + score[i] + " and their grade is: A");
            }
            else if (score[i] >= highscore - 20) {
                System.out.println("Student " + i + "'s score is: " + score[i] + " and their grade is: B");
            }
            else if (score[i] >= highscore - 30) {
                System.out.println("Student " + i + "'s score is: " + score[i] + " and their grade is: C");
            }
            else if (score[i] >= highscore - 40) {
                System.out.println("Student " + i + "'s score is: " + score[i] + " and their grade is: D");
            }
            else {
                System.out.println("Student " + i + "'s score is: " + score[i] + " and their grade is: F");
            }
    }
    }
}