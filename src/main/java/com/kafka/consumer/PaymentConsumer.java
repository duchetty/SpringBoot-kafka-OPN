package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {

	@KafkaListener(topics="orders", groupId="payment-group")
	public void processPayment(String order)
	{
		System.out.println("Processing payment for :"+ order);
	}
}
