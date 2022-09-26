package com.EM.EntityMap.Repository;

import com.EM.EntityMap.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
