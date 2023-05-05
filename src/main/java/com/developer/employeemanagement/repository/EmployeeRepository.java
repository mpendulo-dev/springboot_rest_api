package com.developer.employeemanagement.repository;

import com.developer.employeemanagement.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Repository: A repository is an interface that provides methods to interact with the database.
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
