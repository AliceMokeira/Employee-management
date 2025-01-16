package com.example.emq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.emq.requests.EmployeeRequest;

@Service
public class RabbitMQProducer {
	@Value("${rabbitmq.exchange.name}")
	private String exchange;
	
	@Value("${rabbitmq.routing.key}")
	private String routingKey;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMessage(EmployeeRequest employeeRequest) {
		rabbitTemplate.convertAndSend(exchange, routingKey, employeeRequest);
	}
	
	

}
