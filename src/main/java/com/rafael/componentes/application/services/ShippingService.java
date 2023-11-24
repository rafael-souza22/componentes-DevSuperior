package com.rafael.componentes.application.services;

import org.springframework.stereotype.Service;

import com.rafael.componentes.application.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {

		if (order.getBasic() < 100.00) {
			return 20.0;
		} else if (order.getBasic() > 100.00 || order.getBasic() <= 200.00) {
			return 12.0;
		}
		return 0.0;
	}
}