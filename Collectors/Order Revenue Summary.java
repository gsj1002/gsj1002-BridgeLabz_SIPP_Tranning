import java.util.*;
import java.util.stream.Collectors;

class Order {
    private String customer;
    private double total;
    
    public Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
    
    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}

public class OrderRevenue {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("John", 150.50),
            new Order("Jane", 200.75),
            new Order("John", 75.25),
            new Order("Bob", 300.00),
            new Order("Jane", 125.50)
        );
        
        Map<String, Double> revenuePerCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomer,
                Collectors.summingDouble(Order::getTotal)
            ));
        
        System.out.println("Revenue per customer:");
        revenuePerCustomer.forEach((customer, total) -> 
            System.out.println(customer + ": $" + total));
    }
}