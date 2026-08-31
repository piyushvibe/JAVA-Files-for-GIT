class Calculator {

    static int calculationCount = 0;

    // Addition of integers
    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    // Addition of decimal numbers
    double add(double a, double b) {
        calculationCount++;
        return a + b;
    }

    // Display calculation count
    static void showCount() {
        System.out.println("Total calculations: " + calculationCount);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition of integers: " + c.add(10, 20));

        System.out.println("Addition of decimals: " + c.add(10.5, 20.7));

        System.out.println("Addition of integers: " + c.add(5, 15));

        Calculator.showCount();
    }
}