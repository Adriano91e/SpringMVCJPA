package it.dstech.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dstech.springmvc.dao.EmployeeDao;
import it.dstech.springmvc.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}

	public List<Employee> findAllEmployee() {
		return dao.findAllEmployee();
	}

	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
	}

	public Employee findById(int id) {
		return dao.findById(id);
	}

	public Employee updateEmployee(Employee employee) {

		employee.setName(employee.getName());
		employee.setSalary(employee.getSalary());
		employee.setSsn(employee.getSsn());

		return dao.updateEmployee(employee);
	}

}
