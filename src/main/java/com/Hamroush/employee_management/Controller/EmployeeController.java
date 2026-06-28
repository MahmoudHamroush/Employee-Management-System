package com.Hamroush.employee_management.Controller;

import com.Hamroush.employee_management.Model.Employee;
import com.Hamroush.employee_management.Service.EmployeeService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@Data
public class EmployeeController {

    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    // Add Employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);
    }
    // Get All Employees
    @GetMapping("/all")
    public List<Employee> getAllEmployees()
    {

        return employeeService.getAllEmployees();
    }
    // Get Employee By id
    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
    // Update Employee
    @PutMapping("/update/{id}")
    public Employee updateDepartment(@PathVariable Long id , @RequestBody Employee employee){
        return employeeService.updateEmployee(id ,employee);
    }
    // Delete Employee By id
    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable Long id){

        employeeService.deleteEmployee(id);
    }
}
