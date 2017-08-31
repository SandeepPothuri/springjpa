package com.unnab.jpa2.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unnab.jpa2.dao.EmployeeDAO;
import com.unnab.jpa2.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	EntityManager em;

	@Override
	public List<Employee> getEmployee(Integer id) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> emp = cq.from(Employee.class);
		cq.select(emp).where(cb.equal(emp.get("id"),id));
		TypedQuery<Employee> tq = em.createQuery(cq);
		return tq.getResultList();
	}
}
