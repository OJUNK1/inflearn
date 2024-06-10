package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2)); // 객체의 참조가 다르므로 동일성은 다르다
        System.out.println("equality = " + (user1.equals(user2))); // user1, user2는 서로 다른 객체이지만 둘다 같은 id(고객번호)를 가지고 있다. 따라서 동등하다.
    }
}
