package CursoJava.EnumPratice.src.main.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import CursoJava.EnumPratice.src.main.enums.OrderStatus;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }
    
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void addItem(OrderItem item) {
        items.add(item);
    }
    
    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
}
