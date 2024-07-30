public interface PaymentProcessor {
    void processPayment(double amount);
}


class PayPal {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}


class Stripe {
    public void pay(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}


class Square {
    public void doPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Square.");
    }
}
