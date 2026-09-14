package org.arianewelke.desafio1.services;

import org.arianewelke.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double basicWithDiscount = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
        double shippingValue = shippingService.shipment(order);
        return basicWithDiscount + shippingValue;
    }
}
