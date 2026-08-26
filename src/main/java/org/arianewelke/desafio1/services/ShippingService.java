package org.arianewelke.desafio1.services;

import org.arianewelke.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double basicValue) {
        if (basicValue < 100) return 20;
        else if ( basicValue < 200) return 12;
        else return 0;
    }
}
