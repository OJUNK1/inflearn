package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int num = 1;

        int sum = 0;

        int max = 100;
        while (num <= max) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }


}
