package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int numbers = scanner.nextInt();

        int[][] score = new int[numbers][3];
        String[] subjects = {"국어", "영어", "수학"};
        int[] sum = new int[numbers];
        double[] average = new double[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < score[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                score[i][j] = scanner.nextInt();
                sum[i] += score[i][j];
            }

            average[i] = (double) sum[i] / score[i].length;
        }

        for(int i = 0; i < numbers; i++) {
            System.out.println(i + "번 학생의 총점: " + sum[i] + ", 평균: " + average[i]);
        }
    }
}
