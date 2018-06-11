package it.dstech.springmvc.service;

import java.util.List;

import it.dstech.springmvc.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> findAllEmployee();

	void deleteEmployee(int id);

	Employee findById(int id);

	Employee updateEmployee(Employee employee);

}
