package com.example.HibernateAssignment2.service.impl;

import com.example.HibernateAssignment2.entity.Department;
import com.example.HibernateAssignment2.repository.DepartmentRepository;
import com.example.HibernateAssignment2.service.DepartmentService;
import com.example.HibernateAssignment2.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public Department addDepartment(Department department) {

//        department.getProfessors().stream().forEach(professor -> professor.setDepartment(department));
        return departmentRepository.save(department);
    }

    public String deleteDepartment(String id) {
//
        if (departmentRepository.findById(id).isPresent()) {
            departmentRepository.deleteById(id);
            return "Successfully deleted";
        } else {
            return "Not Deleted";
        }
    }
}
