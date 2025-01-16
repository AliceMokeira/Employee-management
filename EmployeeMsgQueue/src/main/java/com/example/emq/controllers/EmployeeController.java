package com.example.emq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emq.producer.RabbitMQProducer;
import com.example.emq.requests.EmployeeRequest;
import com.example.emq.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private RabbitMQProducer rabbitMQProducer;
	
	@PostMapping("/employee")
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeRequest employeeRequest){
		rabbitMQProducer.sendMessage(employeeRequest);
		return ResponseEntity.ok("Employee data sent to consumer");
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllEmployees(){
		return ResponseEntity.ok(employeeService.getAllEmployees());
	}

}
