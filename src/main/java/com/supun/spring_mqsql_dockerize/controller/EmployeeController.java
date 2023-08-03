package com.supun.spring_mqsql_dockerize.controller;

import com.supun.spring_mqsql_dockerize.entity.Employee;
import com.supun.spring_mqsql_dockerize.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
@Controller("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        var result = employeeService.getAllEmployee();
        return ResponseEntity.ok(result);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        var result = employeeService.saveEmployee(employee);
        return ResponseEntity.ok(result);
    }
}
