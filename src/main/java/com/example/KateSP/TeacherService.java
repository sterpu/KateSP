package com.example.KateSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private GradeRepository gradeRepository;

    public TeacherEntity getById(int id) {
        return teacherRepository.findById(id);
    }

    @Transactional
    public TeacherEntity createTeacher(String name) {
        TeacherEntity result = new TeacherEntity();
        result.setName(name);
        result.setGrade(gradeRepository.findById(1).get());
        teacherRepository.save(result);
        return result;
    }

    @Transactional
    public TeacherEntity updateTeachersGrade(Integer teacherId, Integer gradeId) {
        TeacherEntity teacherEntity = getById(teacherId);
        teacherEntity.setGrade(gradeRepository.findById(gradeId).get());
        TeacherEntity result = teacherRepository.update(teacherEntity);
        return result;
    }

    @Transactional
    public String deleteTeacher(Integer teacherId) {
        teacherRepository.remove(getById(teacherId));
        return "Успешно удалено";
    }

    public Set<TeacherEntity> getTeachersByGradeId(Integer gradeId) {
        return teacherRepository.getTeachersByGradeId(gradeId);
    }
}
