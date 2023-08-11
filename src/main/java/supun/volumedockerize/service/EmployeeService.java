package supun.volumedockerize.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import supun.volumedockerize.entity.Employee;
import supun.volumedockerize.repository.EmployeeRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

}
