package de.telran.simplespringproject;

import de.telran.simplespringproject.beans.Order;
import de.telran.simplespringproject.beans.PaymentGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "de.telran.simplespringproject.beans")
public class MyConfig {

//    @Bean
//    public Order order() {
//        return new Order("NewItem", 5.45);
//    }
//
//    @Bean
//    public PaymentGateway paymentGateway() {
//        return new PaymentGateway(order());
//    }
}
