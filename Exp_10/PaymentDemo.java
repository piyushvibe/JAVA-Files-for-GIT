abstract class Payment {

    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method
    abstract void makePayment();
}

// Credit Card Payment
class CreditCard extends Payment {

    CreditCard(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Payment Method: Credit Card");
        System.out.println("Amount Paid: Rs. " + amount);
        System.out.println("Credit Card payment successful.");
    }
}

// UPI Payment
class UPI extends Payment {

    UPI(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Payment Method: UPI");
        System.out.println("Amount Paid: Rs. " + amount);
        System.out.println("UPI payment successful.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new CreditCard(5000);
        p1.makePayment();

        System.out.println();

        Payment p2 = new UPI(2500);
        p2.makePayment();
    }
}