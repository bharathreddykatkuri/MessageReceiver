package com.evoke.messaging.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.evoke.messaging.model.Employee;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${com.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee.getName());
	}
}