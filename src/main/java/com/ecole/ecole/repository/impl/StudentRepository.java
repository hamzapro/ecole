package com.ecole.ecole.repository.impl;

import com.ecole.ecole.entity.Student;
import com.ecole.ecole.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class StudentRepository implements IStudentRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public Student save(Student student) {
        return null;
    }
}
