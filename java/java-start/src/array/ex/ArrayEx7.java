package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};
        int[] sum = new int[scores.length];
        double[] average = new double[scores.length];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
                sum[i] += scores[i][j];
            }

            average[i] = (double) sum[i] / scores[i].length;
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + "번 학생의 총점: " + sum[i] + ", 평균: " + average[i]);
        }
    }
}
