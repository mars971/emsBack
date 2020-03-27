package com.hub.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hub.ems.model.Employee;

/**
 * 
 * @author Mars
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
