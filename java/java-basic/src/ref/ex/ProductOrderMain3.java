package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명:");
            String productName = scanner.nextLine();

            System.out.print("가격:");
            int price = scanner.nextInt();

            System.out.print("수량:");
            int quantity = scanner.nextInt();
            scanner.nextLine(); //입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrder) {
        for (ProductOrder order : productOrder) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrder) {
        int totalAmount = 0;
        for (ProductOrder order : productOrder) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
