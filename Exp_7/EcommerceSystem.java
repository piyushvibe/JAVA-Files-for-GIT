interface ProductInterface {
    void displayProduct();
    double calculatePrice();
}

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Electronic extends Product implements ProductInterface {

    Electronic(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("\n--- Electronic Product ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + price);
    }

    @Override
    public double calculatePrice() {
        return price + (price * 0.18);
    }
}

class Clothing extends Product implements ProductInterface {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("\n--- Clothing Product ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + price);
    }

    @Override
    public double calculatePrice() {
        return price + (price * 0.12);
    }
}

class Grocery extends Product implements ProductInterface {

    Grocery(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void displayProduct() {
        System.out.println("\n--- Grocery Product ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + price);
    }

    @Override
    public double calculatePrice() {
        return price + (price * 0.05);
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {

        Electronic e = new Electronic(101, "Laptop", 50000);
        Clothing c = new Clothing(102, "T-Shirt", 1000);
        Grocery g = new Grocery(103, "Rice", 500);

        e.displayProduct();
        System.out.println("Final Price: Rs. " + e.calculatePrice());

        c.displayProduct();
        System.out.println("Final Price: Rs. " + c.calculatePrice());

        g.displayProduct();
        System.out.println("Final Price: Rs. " + g.calculatePrice());
    }
}