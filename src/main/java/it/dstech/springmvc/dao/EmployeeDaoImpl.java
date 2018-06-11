package it.dstech.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import it.dstech.springmvc.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	public Employee saveEmployee(Employee employee) {

		persist(employee);
		return employee;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployee() {

		Criteria criteria = getSession().createCriteria(Employee.class);
		return criteria.list();
	}

	public void deleteEmployee(int id) {

		Employee employee = findById(id);
		delete(employee);
	}

	public Employee findById(int id) {

		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));
		return (Employee) criteria.uniqueResult();
	}

	public Employee updateEmployee(Employee employee) {

		update(employee);
		return employee;
	}
	
//	@SuppressWarnings("unchecked")
//	public List<Employee> findAllEmployee(String query){
//		Criteria criteria=getSession().createCriteria(Employee.class);
//		criteria.add(Restrictions.sqlRestriction(query));
//		return criteria.list();
//		
//	}

}
