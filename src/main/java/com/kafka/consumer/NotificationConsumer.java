package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {
	
	@KafkaListener(topics="orders", groupId="notification-group")
	public void sendNotification(String order)
	{
		System.out.println("Sending conformation for :"+order);
	}
}
