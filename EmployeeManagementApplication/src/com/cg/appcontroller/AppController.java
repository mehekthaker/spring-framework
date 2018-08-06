package com.cg.appcontroller;

import java.util.Map;
import java.util.TreeSet;

import com.cg.employee.bean.*;
import com.cg.serviceLayer.EmployeeService;

public class AppController implements Controller{

	EmployeeService service;

	@Override
	public void addEmployee(Map map) {
		Employee employee = new Employee(map.get("employeeName").toString(), Double.parseDouble(map.get("employeeSalary").toString()));
		System.out.println(employee);
		service.addEmployee(employee);
		
	}

	@Override
	public TreeSet<Employee> viewAllEmployee() {
		TreeSet<Employee> employee = service.viewAllEmployee();
		return employee;
	}

	@Override
	public Employee getEmpById(int id) {
		Employee employee = service.getEmpById(id);
		return employee;
	}

	@Override
	public void deleteEmp(int id) {
		service.deleteEmp(id);
		
	}

	@Override
	public void setService(EmployeeService service) {
		this.service = service;
		
	}
	
}
