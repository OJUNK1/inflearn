package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str1 = "hello";
        str1.concat("java"); // String은 불변 객체
        System.out.println("str1 = " + str1);

        String str2 = str1.concat("java");
        System.out.println("str2 = " + str2);
    }
}
