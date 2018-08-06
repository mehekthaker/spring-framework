package com.cg.employeedao;

import java.util.Map;
import java.util.TreeSet;

import com.cg.employee.bean.Employee;


public class EmployeeDao {
	
	TreeSet<Employee> empSet = new TreeSet<>();
	Employee employee = new Employee(null, 0);
	
	public void addEmployee(Employee emp) {
		empSet.add(emp);
	}
	
	public TreeSet<Employee> viewAllEmployee() {
		return (TreeSet<Employee>) empSet;
	}
	
	
	public Employee getEmpById(int empId) {
		Employee employee = null;
		for(Employee emp: empSet) {
			if(employee.getEmpId() == empId) {
				employee = emp;
			}
		}
		return employee;		
		
	}

	public void deleteEmployee(int empId) {
		//Employee employee = null;
		for(Employee emp: empSet) {
			if(employee.getEmpId() == empId) {
				empSet.remove(emp);
			}
		}
		
			
		
			
	}
}
