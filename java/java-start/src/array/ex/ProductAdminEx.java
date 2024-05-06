package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        boolean isTrue = true;
        while (isTrue) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int option = scanner.nextInt(); // \n
            scanner.nextLine();

            switch (option) {
                case 1:
                    if(productCount >= maxProducts) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    }
                    System.out.print("상품 이름을 입력하세요:");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요:");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;
                    break;
                case 2:
                    if(productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                    }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i]);
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    isTrue = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다");
                    break;
            }
        }
    }
}
