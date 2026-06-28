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
    // create
    public Department addDepartment(Department department){

        return departmentRepository.save(department);
    }
    // read
    public Department getDepartmentById(Long id){
        return departmentRepository.getReferenceById(id);
    }
    // read all
    public List<Department> getAllDepartments(){

        return departmentRepository.findAll();
    }
    // save
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
    // update
    public Department updateDepartment(Long id, Department departmentDetails){
        Department department = departmentRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Department Not Found By Id" + id));
        department.setName(departmentDetails.getName());
        return departmentRepository.save(department);
    }
    // delete
    public void deleteDepartment(Long id){

        departmentRepository.deleteById(id);
    }
}
