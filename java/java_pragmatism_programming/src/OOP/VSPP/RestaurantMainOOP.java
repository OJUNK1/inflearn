package OOP.VSPP;

import java.util.List;

public class RestaurantMainOOP {

    private List<Store> stores;

    public long calculateRevenue() {
        long revenue = 0;
        for (Store store : stores) {
            revenue += store.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Store store : stores) {
            income += store.calculateProfit();
        }

        return income;
    }


    class Store {
        private List<Order> orders;
        private long rentalFee; // 임대료

        // 비즈니스 로직을 객체가 처리하도록 변경
        public long calculateRevenue() {
            long revenue = 0;

            for (Order order : orders) {
                revenue += order.calculateRevenue();
            }
            return revenue;
        }

        public long calculateProfit() {
            long income = 0;

            for (Order order : orders) {
                income += order.calculateProfit();
            }

            return income - rentalFee;
        }
    }

    class Order {

        private List<Food> foods;
        private double transactionFeePercent = 0.03; // 결제 수수료 3%

        public long calculateRevenue() {
            long revenue = 0;
            for (Food food : foods) {
                revenue += food.calculateRevenue();
            }
            return revenue;
        }

        public long calculateProfit() {
            long income = 0;
            for (Food food : foods) {
                income += food.calculateProfit();
            }
            return (long) (income - calculateRevenue() * transactionFeePercent);
        }
    }

    class Food {

        private long price;
        private long originCost;

        public long calculateRevenue() {
            return price;
        }

        public long calculateProfit() {
            return price - originCost;
        }
    }
}

