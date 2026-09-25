package id.ac.polinema.oop;

/**
 * An item line in a customer order.
 * Represents an association with MenuItem.
 */
public class OrderItem {

    private MenuItem menuItem;
    private int quantity;

    /**
     * Creates an order item with the given menu item and quantity.
     *
     * @param menuItem the menu item ordered
     * @param quantity the number of items ordered
     */
    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Calculates the subtotal for this item line.
     *
     * @return price of the menu item multiplied by quantity
     */
    public double getSubtotal() {
        return menuItem.getPrice() * quantity;
    }
}
