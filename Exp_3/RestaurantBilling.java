class Restaurant {

    static int totalOrders = 0;

    // Dine-in bill
    double calculateBill(double foodAmount) {
        totalOrders++;
        return foodAmount + (foodAmount * 0.05);
    }

    // Takeaway bill
    double calculateBill(double foodAmount, double packagingCharge) {
        totalOrders++;
        return foodAmount + packagingCharge;
    }

    // Delivery bill
    double calculateBill(double foodAmount, double deliveryCharge, double packagingCharge) {
        totalOrders++;
        return foodAmount + deliveryCharge + packagingCharge;
    }

    // Display total orders
    static void showTotalOrders() {
        System.out.println("Total orders: " + totalOrders);
    }
}

public class RestaurantBilling {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        // Dine-in
        double dineInBill = r.calculateBill(1000);
        System.out.println("Dine-in bill: Rs. " + dineInBill);

        // Takeaway
        double takeawayBill = r.calculateBill(800, 30);
        System.out.println("Takeaway bill: Rs. " + takeawayBill);

        // Delivery
        double deliveryBill = r.calculateBill(1200, 50, 30);
        System.out.println("Delivery bill: Rs. " + deliveryBill);

        Restaurant.showTotalOrders();
    }
}