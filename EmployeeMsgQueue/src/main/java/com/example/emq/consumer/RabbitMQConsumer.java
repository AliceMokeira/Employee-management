package com.example.emq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emq.requests.EmployeeRequest;
import com.example.emq.services.EmployeeService;

@Service
public class RabbitMQConsumer {
	@Autowired
	private EmployeeService employeeService;
	
	@RabbitListener(queues = {"${rabbitmq.queue.name}"})
	public void consumeMessage(EmployeeRequest employeeRequest) {
		employeeService.postEmployee(employeeRequest);
	}

}
