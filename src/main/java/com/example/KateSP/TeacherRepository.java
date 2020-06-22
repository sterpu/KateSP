package com.example.KateSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class TeacherRepository {
    @Autowired
    private EntityManager entityManager;

    public TeacherEntity findById(int id) {
        return entityManager.find(TeacherEntity.class, id);
    }

    public void save(TeacherEntity entity) {
        entityManager.persist(entity);
    }

    public TeacherEntity update(TeacherEntity teacherEntity) {
        return entityManager.merge(teacherEntity);
    }

    public void remove(TeacherEntity teacherEntity) {
        entityManager.remove(teacherEntity);
    }
}
