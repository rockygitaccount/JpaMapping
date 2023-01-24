package com.Onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Onetomany.entity.Employee;
import com.Onetomany.repositories.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	@Override
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		employeeRepo.save(employee);
		return employee;
	}
	@Override
	public Employee updateEmployee(Employee employee) {
        employeeRepo.save(employee);
		return employee;
	}
	@SuppressWarnings("deprecation")
	@Override
	public void deleteEmployee(long parseLong) {
     Employee entity =employeeRepo.getOne(parseLong);
     employeeRepo.delete(entity);
	}
	

}
