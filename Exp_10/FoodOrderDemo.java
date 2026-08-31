abstract class FoodOrder {

    double foodPrice;

    FoodOrder(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    // Abstract method
    abstract void calculateBill();
}

// Dine-In Order
class DineInOrder extends FoodOrder {

    double serviceCharge;

    DineInOrder(double foodPrice) {
        super(foodPrice);
        serviceCharge = foodPrice * 0.05;
    }

    @Override
    void calculateBill() {
        double total = foodPrice + serviceCharge;

        System.out.println("--- Dine-In Order ---");
        System.out.println("Food Price: Rs. " + foodPrice);
        System.out.println("Service Charge: Rs. " + serviceCharge);
        System.out.println("Total Bill: Rs. " + total);
    }
}

// Takeaway Order
class TakeAwayOrder extends FoodOrder {

    double packagingCharge;

    TakeAwayOrder(double foodPrice) {
        super(foodPrice);
        packagingCharge = 30;
    }

    @Override
    void calculateBill() {
        double total = foodPrice + packagingCharge;

        System.out.println("--- Takeaway Order ---");
        System.out.println("Food Price: Rs. " + foodPrice);
        System.out.println("Packaging Charge: Rs. " + packagingCharge);
        System.out.println("Total Bill: Rs. " + total);
    }
}

public class FoodOrderDemo {
    public static void main(String[] args) {

        FoodOrder dineIn = new DineInOrder(1000);
        dineIn.calculateBill();

        System.out.println();

        FoodOrder takeAway = new TakeAwayOrder(800);
        takeAway.calculateBill();
    }
}