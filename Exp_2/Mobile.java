class Mobile {

    String brand;
    int price;

    // Default Constructor
    Mobile() {
        brand = "Motorola";
        price = 20000;
    }

    // Parameterized Constructor
    Mobile(String b, int p) {
        brand = b;
        price = p;
    }

    // Copy Constructor
    Mobile(Mobile m) {
        brand = m.brand;
        price = m.price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile();                  // Default Constructor
        Mobile m2 = new Mobile("Samsung", 35000);  // Parameterized Constructor
        Mobile m3 = new Mobile(m2);                // Copy Constructor

        System.out.println("Mobile 1:");
        m1.display();

        System.out.println();

        System.out.println("Mobile 2:");
        m2.display();

        System.out.println();

        System.out.println("Duplicate Mobile Record:");
        m3.display();
    }
}