package com.Hamroush.employee_management.Controller;


import com.Hamroush.employee_management.Model.Department;
import com.Hamroush.employee_management.Service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private DepartmentService departmentService;
    public DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }
    // Add Department
    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }
    // Get All Departments
    @GetMapping("/all")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
    // Get Department By Id
    @GetMapping("/get/{id}")
    public Department getDepartmentById(@PathVariable Long id){
        return departmentService.getDepartmentById(id);
    }
    // Update Department
    @PutMapping("/update/{id}")
    public Department updateDepartment(@PathVariable Long id , @RequestBody Department department){
        return departmentService.updateDepartment(id, department);
    }
    // Delete Department By Id
    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(@PathVariable Long id){

        departmentService.deleteDepartment(id);
    }
}
