import java.awt.*;
import java.util.ArrayList;

public class Order {
    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;
    private static int nextOrderNumber = 1;

    public Order(CafeCustomer customer) {
        this.orderNumber = nextOrderNumber++; //take the current number then increase
        this.customer = customer;
        this.items = new ArrayList<>();
        this.paid = false;   //not paid at first
    }
    public void addItem(MenuItem item) {
    this.items.add(item);}
    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public int countItems() {
        return items.size();
    }
    public void markAsPaid() {
        this.paid = true;
    }
    public static int getNextOrderNumber() {
        return nextOrderNumber;
    }

    @Override
    public String toString() {
        return "Order Number=" + orderNumber+ "\n" + "Customer: " + customer.getFirstName()+ "\n" + "Number of Items: " + items.size()+ "\n" + "Total: " + calculateTotal() + " PLN\n " + "Paid: " + paid + "\n"  ;
    }


}
