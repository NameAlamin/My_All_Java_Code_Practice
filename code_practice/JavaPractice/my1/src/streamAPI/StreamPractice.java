package streamAPI;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    static Customer customer1 = new Customer();
    static Customer customer2 = new Customer();
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        init();

        // TODO: 1. Find out 3 products with maximum ratings.
//        customer1.getOrders().stream()
//                .map(Order::getItem)
//                .flatMap(Collection::stream)
//                .forEach(System.out::println);


        var setOfProduct = customer1
                .getOrders().stream()
                .map(Order::getItems).flatMap(Collection::stream).collect(Collectors.toSet());

        System.out.println("\n=========== Products with Maximum ratings ============");
        setOfProduct.stream()
                .sorted(
                        Comparator.comparing(Product::getRating)
                                .reversed()
                                .thenComparing(Product::getName)
                )
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n=========== Products with Minimum ratings ============");
        setOfProduct.stream()
                .sorted(Comparator.comparing(Product::getRating).thenComparing(Product::getName))
                .limit(3)
                .forEach(System.out::println);

    }

    private static void init() {

        // todo: add product
        Product product1 = new Product();
        product1.setName("C Programming");
        product1.setPrice(BigDecimal.valueOf(420));
        product1.setAuthor("Alamin");
        product1.setRating(9);

        Product product2 = new Product();
        product2.setName("Data Structure");
        product2.setPrice(BigDecimal.valueOf(330));
        product2.setAuthor("Tamim Subin");
        product2.setRating(9);

        Product product3 = new Product();
        product3.setName("Algorithm");
        product3.setPrice(BigDecimal.valueOf(520));
        product3.setAuthor("Mahamudur Rahaman");
        product3.setRating(10);

        Product product4 = new Product();
        product4.setName("Java Programming");
        product4.setPrice(BigDecimal.valueOf(650));
        product4.setAuthor("Maynul Hasan");
        product4.setRating(10);

        products = List.of(product1,product2,product3,product4);

        // todo: add order
        Order order1 = new Order();
        order1.setOrderId(UUID.randomUUID().toString());

//        order1.setItem(new ArrayList<>()); // product type ??
//        order1.getItem().add(product1);

        List<Product> orderList1 = new ArrayList<>();
        order1.setItems(orderList1);

        // order1.add(product1);  why do getItem.add() ?? how to add list ?
//        order1.getItem().add(product1);
//        order1.getItem().add(product2);
        order1.getItems().add(product3);
//        order1.getItem().add(product4);

        Order order2 = new Order();
        order2.setOrderId(UUID.randomUUID().toString());
        List<Product> orderList2 = new ArrayList<>();
        order2.setItems(orderList2);
        order2.getItems().add(product1);
        order2.getItems().add(product2);
        order2.getItems().add(product3);
        order2.getItems().add(product4);

        Order order3 = new Order();
        order3.setOrderId(UUID.randomUUID().toString());
        List<Product> orderList3 = new ArrayList<>();
        order3.setItems(orderList3);
        order3.getItems().add(product1);
        order3.getItems().add(product2);
        order3.getItems().add(product3);
        order3.getItems().add(product4);

        // todo: add customer
        customer1.setCustomerName("Khokon");
        List<Order> customerOrder1 = new ArrayList<>();
        customerOrder1.add(order1);
        customerOrder1.add(order3);
        customer1.setOrders(customerOrder1);

    }
}
