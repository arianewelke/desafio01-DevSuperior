package org.arianewelke.desafio1;

import org.arianewelke.desafio1.entities.Order;
import org.arianewelke.desafio1.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

    private final OrderService orderService;

    public Desafio1Application(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Desafio1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1309, 95.90, 0.0);
        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
    }
}
