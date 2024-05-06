package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 11000);
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int depositMoney) {
        balance += depositMoney;
        System.out.println(depositMoney + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int withdrawMoney) {
        if(balance >= withdrawMoney) {
            balance -= withdrawMoney;
            System.out.println(withdrawMoney + "원을 출금하였습니다. 현재 잔액: " + balance);
        } else {
            System.out.println(withdrawMoney + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
