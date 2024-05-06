package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int num = 100;
        printNumber(num); // int에서 double로 자동 형변환
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
