package com.cg.userinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.appcontroller.AppController;
import com.cg.employee.bean.Employee;

public class UserInterface {

	//AppController controller;
	
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	Scanner scanner = new Scanner(System.in);
	Map<String, Object> employeeDetails = new HashMap();
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	AppController appController = (AppController) context.getBean("controller");
	

	
	public void start() throws IOException {
		do {
			showMenu();
		} while (true);
	}

	
	private void showMenu() throws IOException {

		System.out.println("-----------MAKE A CHOICE-----------");
		System.out.println("1. Accept Data");
		System.out.println("2. Display Data");

		acceptChoice();
	}

	
	private void acceptChoice() throws IOException {
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			acceptData();
			break;

		case 2:
			displayData();
			break;

		default:
			System.out.println("Invalid Choice");

		}

	}

	
	private void acceptEmployeeID() {
		System.out.println("Enter Employee Id : ");
		int empId = scanner.nextInt();
		Employee employee = appController.getEmpById(empId);
		System.out.println(employee);
	}
	
	
	private void acceptData() throws IOException {

		System.out.println("Enter Employee Name : ");
		String employeeName = bufferedReader.readLine();
		employeeDetails.put("employeeName", employeeName);

		System.out.println("Enter Employee Id : ");
		String employeeId = bufferedReader.readLine();
		employeeDetails.put("employeeId", employeeId);

		System.out.println("Enter Employee salary : ");
		String employeeSalary = bufferedReader.readLine();
		employeeDetails.put("employeeSalary", employeeSalary);
		
		appController.addEmployee(employeeDetails);

	}

	
	private void displayData() {

		Set set = appController.viewAllEmployee();

		set.stream().forEach(System.out::println);
	}

}
