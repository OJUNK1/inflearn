package ref;

public class NullMain2 {
    public static void main(String[] args) {
        //Data data = null;
        Data data = new Data();
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data);
    }
}
