package loop;

public class For2 {
    public static void main(String[] args) {
        int endNum =  3;
        int sum = 0;
        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
