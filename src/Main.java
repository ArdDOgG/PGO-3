public class Main {
    public static void main(String[] args) {

        MenuItem m1 = new MenuItem("C-01", "Espresso", 9.0, "coffee");
        MenuItem m2 = new MenuItem("C-02", "Cappuccino", 13.5, "coffee");
        MenuItem m3 = new MenuItem("D-01", "Cheesecake", 16.0, "dessert");

        CafeCustomer customer = new CafeCustomer(100, "Julia", "Mazur", "j.mazur@mail.pl");

        Order order = new Order(customer);
        order.addItem(m1);
        order.addItem(m2);
        order.addItem(m3);

        System.out.println("=== CUSTOMER ===");
        System.out.println(customer);

        System.out.println("\n=== ORDER ===");
        System.out.println(order);

        System.out.println("\n=== SUMMARY ===");
        System.out.println("Number of items: " + order.countItems());
        System.out.println("Total price: " + order.calculateTotal() + " PLN");
        System.out.println("Total products in system: " + MenuItem.getProductCount());

        System.out.println("\n=== COMPARISON ===");
        MenuItem espressoCopy = new MenuItem("C-01", "Espresso duplicate", 9.0, "coffee");
        System.out.println("Are m1 and espressoCopy equal? " + m1.equals(espressoCopy));

        CafeCustomer customerCopy = new CafeCustomer(100, "Julia", "Mazur", "j.mazur@mail.pl");
        System.out.println("Are customer and customerCopy equal? " + customer.equals(customerCopy));

        System.out.println("\n=== AFTER PAYMENT ===");
        order.markAsPaid();
        System.out.println(order);
    }
}