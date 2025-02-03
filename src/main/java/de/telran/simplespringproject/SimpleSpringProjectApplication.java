package de.telran.simplespringproject;

import de.telran.simplespringproject.beans.Order;
import de.telran.simplespringproject.beans.PaymentGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleSpringProjectApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(MyConfig.class);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Order orderBean = context.getBean("order", Order.class);
        PaymentGateway paymentGateway = context.getBean("paymentGateway", PaymentGateway.class);

        System.out.println(paymentGateway);

        context.close();
    }

}
