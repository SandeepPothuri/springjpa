package com.unnab.jpa2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unnab.jpa2.dao.EmployeeDAO;
import com.unnab.jpa2.entity.Employee;
import com.unnab.jpa2.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDao;
	
	@Override
	public List<Employee> getEmployee(Integer id) {
		return employeeDao.getEmployee(id);
	}

}
