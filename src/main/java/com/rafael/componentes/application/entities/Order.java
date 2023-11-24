package com.rafael.componentes.application.entities;

import com.rafael.componentes.application.services.OrderService;
import com.rafael.componentes.application.services.ShippingService;

public class Order {

	private Integer code;
	private Double basic;
	private Double discount;
	
	public OrderService orderService;
	public ShippingService shippingService;
	
	public Order() {
	}

	public Order(Integer code, Double basic, Double discount) {
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
}