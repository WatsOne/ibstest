package ru.alexkulikov.entity;

public class Order extends BaseEntity {

    private int number;
    private String name;
    private Person from;
    private Person to;
    private OrderState state;

    public Order() {
    }

    public Order(int number, String name, Person from, Person to, OrderState state) {
        this.number = number;
        this.name = name;
        this.from = from;
        this.to = to;
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getFrom() {
        return from;
    }

    public void setFrom(Person from) {
        this.from = from;
    }

    public Person getTo() {
        return to;
    }

    public void setTo(Person to) {
        this.to = to;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + getId() +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", state=" + state +
                '}';
    }
}