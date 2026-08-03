class vehicle {

    String name = "Motorcycle";
    String color = "Black";

    // Inner Class
    class Details {
        void display() {
            System.out.println("Vehicle Name: " + name);
            System.out.println("Vehicle Color: " + color);
        }
    }

    public static void main(String[] args) {

        vehicle v = new vehicle();

        // Creating object of Inner Class
        vehicle.Details d = v.new Details();
        d.display();

        // Anonymous Class
        Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Vehicle is running...");
            }
        };

        action.run();
    }
}