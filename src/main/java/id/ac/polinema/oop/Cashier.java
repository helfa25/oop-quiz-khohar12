package id.ac.polinema.oop;

public class Cashier {
    public Cashier() {
    }

    public double calculateChange(Order order, double cash) {

        return cash - order.getFinalTotal() - 10/100 * order.getFinalTotal();
    }
}