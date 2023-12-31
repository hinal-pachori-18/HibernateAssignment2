package com.example.HibernateAssignment2.repository;

import com.example.HibernateAssignment2.entity.Department;
import com.example.HibernateAssignment2.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor,Integer> {
}
