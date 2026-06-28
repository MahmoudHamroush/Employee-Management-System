package com.Hamroush.employee_management.Service;

import com.Hamroush.employee_management.Model.Employee;
import com.Hamroush.employee_management.Model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }
    // create
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    // get all
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }
    // read
    public Employee getEmployeeById(Long id){

        return employeeRepository.getReferenceById(id);
    }
    //update
    public Employee updateEmployee(Long id , Employee employeeDetails){

        Employee employee = employeeRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Employee Not Found By Id" + id));
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setSalary(employeeDetails.getSalary());
        employee.setEmail(employeeDetails.getEmail());
        employee.setDepartment(employeeDetails.getDepartment());
        return employeeRepository.save(employee);
    }
    // delete
    public void deleteEmployee(Long id){

        employeeRepository.deleteById(id);
    }

}
