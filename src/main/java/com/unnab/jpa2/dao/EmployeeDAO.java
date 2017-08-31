package com.unnab.jpa2.dao;

import java.util.List;

import com.unnab.jpa2.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> getEmployee(Integer id);
}
