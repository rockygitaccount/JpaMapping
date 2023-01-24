package com.Onetomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.Onetomany.entity.Employee;

@Transactional
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
