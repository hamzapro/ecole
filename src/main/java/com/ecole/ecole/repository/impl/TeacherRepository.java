package com.ecole.ecole.repository.impl;

import com.ecole.ecole.entity.Teacher;
import com.ecole.ecole.repository.ITeacherRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TeacherRepository implements ITeacherRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public Teacher save(Teacher teacher) {
        return null;
    }
}
