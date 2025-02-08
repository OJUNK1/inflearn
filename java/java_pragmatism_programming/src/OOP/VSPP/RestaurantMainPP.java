package OOP.VSPP;


import lombok.Getter;

import java.util.List;

// 각 객체가 비즈니스 로직을 처리함. 각 객체는 매출과 순이익을 계산해달라는 요청이 들어왔을 때 어떻게 처리해야 할 지 알고 있음.
// 어떤 요청이 들어왔을 때, 어떤 일을 책임지고 처리한다. 라는 책임이 생긴 것.
// 즉, 객체에 어떤 메시지를 전달할 수 있게 됐다.
// 객체가 어떤 책임을 지게 됐다.
// 객체는 어떤 책임을 처리하는 방법을 스스로 알고 있다.
public class RestaurantMainPP {

    private List<Store> stores;

    // 매출을 계산하는 함수
    public long calculateRevenue() {
        long revenue = 0;
        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                for (Food food : order.getFoods()) {
                    revenue += food.getPrice();
                }
            }
        }

        return revenue;
    }

    // 순이익을 계산하는 함수
    public long calculateProfit() {
        long cost = 0;
        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                long orderPrice = 0;
                for (Food food : order.getFoods()) {
                    orderPrice += food.getPrice();
                    cost += food.getOriginCost();
                }
                // 결제 금액의 3%를 비용으로 잡는다.
                cost += orderPrice * order.getTransactionFeePercent();
            }
            cost += store.getRentalFee();

        }
        return calculateRevenue() - cost;
    }
}

@Getter
class Store {
    private List<Order> orders;
    private long rentalFee; // 임대료
}

@Getter
class Order {

    private List<Food> foods;
    private double transactionFeePercent = 0.03;
}

@Getter
class Food {

    private long price;
    private long originCost;
}