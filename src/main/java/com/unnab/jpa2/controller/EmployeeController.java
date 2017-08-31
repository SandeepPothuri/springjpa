package com.unnab.jpa2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unnab.jpa2.entity.Employee;
import com.unnab.jpa2.service.EmployeeService;
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@RequestMapping(name="/empList",method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployeeListById(@RequestParam(value = "id", required = true) int id){
		System.out.println("id::"+id);
		
		List<Employee> empList = employeeService.getEmployee(new Integer(id));
		return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
	}
}
