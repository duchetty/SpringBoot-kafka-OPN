package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.OrderProducer;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderProducer orderProducer;
	
	@PostMapping("/place")
	public String placeOrder(@RequestParam String order)
	{
		orderProducer.sendOrder(order);
		return "order placed successfully";
	}
}
