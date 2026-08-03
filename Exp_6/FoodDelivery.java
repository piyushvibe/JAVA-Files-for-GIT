class FoodDelivery {

    String foodName = "Pizza";
    int quantity = 2;

    // Inner Class
    class OrderDetails {
        void displayOrder() {
            System.out.println("Food Item: " + foodName);
            System.out.println("Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {

        FoodDelivery fd = new FoodDelivery();

        // Creating object of Inner Class
        FoodDelivery.OrderDetails order = fd.new OrderDetails();
        order.displayOrder();

        // Anonymous Class
        Runnable delivery = new Runnable() {
            @Override
            public void run() {
                System.out.println("Delivery Status: Order Delivered Successfully!");
            }
        };

        delivery.run();
    }
}