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
    @GetMapping("/getAll")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }
    @DeleteMapping("/{id}")
    public void deleteDepartment(@RequestBody Department department){
        departmentService.deleteDepartment(department);
    }
}
