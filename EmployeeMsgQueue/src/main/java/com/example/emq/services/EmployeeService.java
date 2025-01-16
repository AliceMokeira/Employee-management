package com.example.emq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emq.entity.Employee;
import com.example.emq.repository.EmployeeRepository;
import com.example.emq.requests.EmployeeRequest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee postEmployee(EmployeeRequest employeeRequest) {
		Employee employee = new Employee();
		employee.setName(employeeRequest.getName());
		employee.setEmail(employeeRequest.getEmail());
		employee.setAge(employeeRequest.getAge());
		employee.setPhoneNumber(employeeRequest.getPhoneNumber());
		employee.setDepartment(employeeRequest.getDepartment());
		employee.setSalary(employeeRequest.getSalary());
		
		employee.setParamOne("Default1");
		employee.setParamTwo("Default2");
		
		return employeeRepository.save(employee);	
		
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}

}
