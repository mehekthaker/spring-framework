package com.cg.employee.bean;

public class Employee implements Comparable<Employee>{

	private String name;
	private int empId;
	private double salary;
	
	
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		++empId;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee arg0) {
		
		return this.getEmpId() - arg0.getEmpId();
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
