package com.Onetomany.service;

import java.util.List;

import com.Onetomany.entity.Employee;

public interface EmployeeService {
	public List<Employee>getEmployee();

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(long parseLong);

}
