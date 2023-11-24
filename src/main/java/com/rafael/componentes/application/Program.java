package com.rafael.componentes.application;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafael.componentes.application.entities.Order;
import com.rafael.componentes.application.services.OrderService;

@SpringBootApplication
public class Program implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Program.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do pedido:");
		System.out.print("Número do pedido: ");
		int code = sc.nextInt();
		System.out.print("Valor básico: ");
		double basic = sc.nextDouble();
		System.out.print("Valor do desconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println();
		System.out.printf("Pedido código " + code + "%nValor total: R$ %.2f", orderService.total(order));

		sc.close();
	}
}