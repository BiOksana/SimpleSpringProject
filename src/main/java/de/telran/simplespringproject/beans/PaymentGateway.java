package de.telran.simplespringproject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    @Autowired
    private Order order;

    public PaymentGateway() {
    }

    public PaymentGateway(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
    }
}
