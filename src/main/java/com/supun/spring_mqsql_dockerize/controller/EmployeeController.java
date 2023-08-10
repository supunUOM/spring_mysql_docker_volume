package com.supun.spring_mqsql_dockerize.controller;

import com.supun.spring_mqsql_dockerize.entity.Employee;
import com.supun.spring_mqsql_dockerize.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1")
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
