package streamRequirment1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> items;
    private String orderId;

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

}
