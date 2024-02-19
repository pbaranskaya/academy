package by.academy.lesson24;

import java.util.List;

public class Order {

    private Long customerId;
    private Long orderNo;
    private List<OrderItem> orderItem;

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }
}
