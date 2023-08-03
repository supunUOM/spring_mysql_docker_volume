package com.supun.spring_mqsql_dockerize.repository;

import com.supun.spring_mqsql_dockerize.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
