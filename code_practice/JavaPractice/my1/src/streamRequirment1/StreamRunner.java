package streamRequirment1;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class StreamRunner {

    static Customer customer1 = new Customer();
    static Customer customer2 = new Customer();
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        init();



    }

    private static void init() {

        // TODO: Add Product
        Product product1 = new Product();
        product1.setName("C Programming");
        product1.setPrice(BigDecimal.valueOf(420));
        product1.setAuthor("Alamin");
        product1.setRating(9);

        Product product2 = new Product();
        product2.setName("Object Oriented Programming");
        product2.setPrice(BigDecimal.valueOf(750));
        product2.setAuthor("Alamin");
        product2.setRating(9);

        Product product3 = new Product();
        product3.setName("Java Programming Begener");
        product3.setPrice(BigDecimal.valueOf(600));
        product3.setAuthor("Maynul Hasan");
        product3.setRating(10);

        Product product4 = new Product();
        product4.setName("Java Programming Advance");
        product4.setPrice(BigDecimal.valueOf(900));
        product4.setAuthor("Maynul Hasan");
        product4.setRating(10);

        products = List.of(product1, product2, product3, product4);

        // TODO: Add Order
        Order order1 = new Order();
        order1.setOrderId(UUID.randomUUID().toString());
        order1.setItems(new ArrayList<>()); // TODO: problem
        order1.getItems().add(product1);
        order1.getItems().add(product2);

        Order order2 = new Order();
        order2.setOrderId(UUID.randomUUID().toString());
        order2.setItems(new ArrayList<>());
        order2.getItems().add(product3);
        order2.getItems().add(product4);

        // TODO: Add Customer
        customer1.setCustomerName("Khokon");
        List<Order> customerOrders1 = new ArrayList<>(); // TODO: problem
        customerOrders1.add(order1);
        customerOrders1.add(order2);

        customer2.setCustomerName("Razu");
        List<Order> customerOrders2 = new ArrayList<>();
        customerOrders2.add(order1);
        customerOrders2.add(order2);


    }
}
