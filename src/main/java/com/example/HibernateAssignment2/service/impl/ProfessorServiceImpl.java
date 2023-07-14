package com.example.HibernateAssignment2.service.impl;

import com.example.HibernateAssignment2.entity.Department;
import com.example.HibernateAssignment2.entity.Professor;
import com.example.HibernateAssignment2.entity.University;
import com.example.HibernateAssignment2.repository.DepartmentRepository;
import com.example.HibernateAssignment2.repository.ProfessorRepository;
import com.example.HibernateAssignment2.repository.UniversityRepository;
import com.example.HibernateAssignment2.service.DepartmentService;
import com.example.HibernateAssignment2.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Professor> getAllProfessor() {
        return professorRepository.findAll();
    }

    public Professor addProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public String deleteProfessor(int id) {
        if (professorRepository.findById(id).isPresent()) {
            professorRepository.deleteById(id);
            return "Successfully deleted";
        } else {
            return "Not deleted";
        }
    }
}
