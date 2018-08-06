package com.cg.appcontroller;

import java.util.Map;
import java.util.TreeSet;

import com.cg.employee.bean.*;
import com.cg.serviceLayer.EmployeeService;

public interface Controller {

	void addEmployee(Map map);

	TreeSet<Employee> viewAllEmployee();

	Employee getEmpById(int id);

	void deleteEmp(int id);

	public void setService(EmployeeService service);
}
