package com.unnab.jpa2.service;

import java.util.List;

import com.unnab.jpa2.entity.Employee;

public interface EmployeeService {
	public List<Employee> getEmployee(Integer id);
}
