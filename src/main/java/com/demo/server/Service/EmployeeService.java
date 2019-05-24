package com.demo.server.Service;

import com.demo.server.Dao.EmployeeDao;
import com.demo.server.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService {
	@Autowired
	@Qualifier("mysql")
	private EmployeeDao employeeDao;

	public Collection<Employee> getAllEmployees(){
		return this.employeeDao.getAllEmployees();
	}

	public Employee getEmployeeById(int id){
		return this.employeeDao.getEmployeeById(id);
	}

	public void removeEmployeeById(int id) {
		this.employeeDao.removeEmployeeById(id);
	}

	public void updateEmployee(Employee employee){
		this.employeeDao.updateEmployee(employee);
	}

	public void insertEmployee(Employee employee) {
		this.employeeDao.insertEmployeeToDb(employee);
	}
}
