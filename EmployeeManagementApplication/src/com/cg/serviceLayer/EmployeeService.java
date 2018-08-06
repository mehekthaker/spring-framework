package com.cg.serviceLayer;

import java.util.Map;
import java.util.TreeSet;

import com.cg.employee.bean.*;
import com.cg.employeedao.EmployeeDao;

public class EmployeeService implements ServiceLayer{

	EmployeeDao dao;
	Employee emp;
	

	@Override
	public void addEmployee(Employee emp) {
		dao.addEmployee(emp);
		
	}

	@Override
	public TreeSet<Employee> viewAllEmployee() {
		TreeSet<Employee> employee = dao.viewAllEmployee();
		return employee;
	}

	@Override
	public Employee getEmpById(int id) {
		Employee employee = dao.getEmpById(id);
		return employee;
	}

	@Override
	public void deleteEmp(int id) {
		dao.deleteEmployee(id);
		
	}

	@Override
	public void setDao(EmployeeDao employeeDao) {
		this.dao = employeeDao;
		
	}
	
	

}
