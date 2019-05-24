package com.demo.server.Dao;

import com.demo.server.Entity.Employee;

import java.util.Collection;

public interface EmployeeDao {
	Collection<Employee> getAllEmployees();

	Employee getEmployeeById(int id);

	void removeEmployeeById(int id);

	void updateEmployee(Employee employee);

	void insertEmployeeToDb(Employee employee);
}
