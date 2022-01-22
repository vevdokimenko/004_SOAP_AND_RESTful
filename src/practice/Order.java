package practice;

import java.util.List;

public class Order {
    private int orderId;
    private String shopperName;
    private String shopperEmail;
    private List<Content> contents;
    private boolean orderCompleted;

    public Order() {
    }

    public Order(int orderId, String shopperName, String shopperEmail, List<Content> contents, boolean orderCompleted) {
        this.orderId = orderId;
        this.shopperName = shopperName;
        this.shopperEmail = shopperEmail;
        this.contents = contents;
        this.orderCompleted = orderCompleted;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getShopperName() {
        return shopperName;
    }

    public String getShopperEmail() {
        return shopperEmail;
    }

    public List<Content> getContents() {
        return contents;
    }

    public boolean isOrderCompleted() {
        return orderCompleted;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", shopperName='" + shopperName + '\'' +
                ", shopperEmail='" + shopperEmail + '\'' +
                ", contents=" + contents +
                ", orderCompleted=" + orderCompleted +
                '}';
    }
}
