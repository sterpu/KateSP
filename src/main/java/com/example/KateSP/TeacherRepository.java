package com.example.KateSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class TeacherRepository { //переделать в crud repository
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

    public Set<TeacherEntity> getTeachersByGradeId(Integer gradeId) {
        Query query = entityManager.createQuery("from TeacherEntity t where t.grade.id = :gradeId ");
        query.setParameter("gradeId", gradeId);
        List resultList = query.getResultList();
        return new HashSet<>(resultList);
    }
}
