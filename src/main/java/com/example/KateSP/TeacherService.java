package com.example.KateSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public TeacherEntity getById(int id) {
        return teacherRepository.findById(id);
    }

    @Transactional
    public TeacherEntity createTeacher(String name) {
        TeacherEntity result = new TeacherEntity();
        result.setName(name);
        result.setGradeId(1);
        teacherRepository.save(result);
        return result;
    }

    @Transactional
    public TeacherEntity updateTeachersGrade(Integer teacherId, Integer gradeId) {
        TeacherEntity teacherEntity = getById(teacherId);
        teacherEntity.setGradeId(gradeId);
        TeacherEntity result = teacherRepository.update(teacherEntity);
        return result;
    }

    @Transactional
    public String deleteTeacher(Integer teacherId) {
        teacherRepository.remove(getById(teacherId));
        return "Успешно удалено";
    }
}
