package com.Hamroush.employee_management.Service;

import com.Hamroush.employee_management.Model.Department;
import com.Hamroush.employee_management.Model.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }
    public Department addDepartment(Department department){
        return departmentRepository.save(department);
    }
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
    public void deleteDepartment(Department department){
        departmentRepository.delete(department);
    }
}
