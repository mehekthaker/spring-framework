package com.cg.serviceLayer;

import java.util.Map;
import java.util.TreeSet;

import com.cg.employee.bean.*;
import com.cg.employeedao.EmployeeDao;

public interface ServiceLayer {
	
	void addEmployee(Employee emp);
	
	TreeSet<Employee> viewAllEmployee();
	
	Employee getEmpById(int id);
	
	void deleteEmp(int id);
	
	public void setDao(EmployeeDao employeeDao);
	
}
