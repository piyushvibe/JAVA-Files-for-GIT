import java.util.Scanner;

class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class ShapeApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of Rectangle: ");
        double width = sc.nextDouble();

        Circle c = new Circle(radius);
        Rectangle r = new Rectangle(length, width);

        c.area();
        r.area();

        sc.close();
    }
}