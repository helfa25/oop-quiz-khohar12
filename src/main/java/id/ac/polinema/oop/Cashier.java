package id.ac.polinema.oop;

public class Cashier {
    public Cashier() {
    }

    public double calculateChange(Order order, double cash) {
        // Bug 3: offset change slightly
        return cash - order.getFinalTotal() - 50.0;
    }
}