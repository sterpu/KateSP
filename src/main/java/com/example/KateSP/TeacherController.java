package com.example.KateSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher")
    public String getTeacher(@RequestParam(value = "id") String id) {
        TeacherEntity entity = teacherService.getById(Integer.valueOf(id));
        return entity.toString();
    }

    @PostMapping("/teacher")
    public TeacherEntity createTeacher(@RequestParam(value = "name") String name) {
        return teacherService.createTeacher(name);
    }

    @PutMapping("/teacher")
    public TeacherEntity updateTeachersGrade(@RequestParam(value = "id") String id, @RequestParam(value = "grade_id") String gradeId) {
        return teacherService.updateTeachersGrade(Integer.valueOf(id), Integer.valueOf(gradeId));
    }

    @DeleteMapping("/teacher")
    public String deleteTeacher(@RequestParam(value = "id") String id) {
        return teacherService.deleteTeacher(Integer.valueOf(id));
    }

    @GetMapping("/teachers/grade")
    public Set<TeacherEntity> getTeachersByGradeId(@RequestParam(value = "grade_id") String gradeId) {
        return teacherService.getTeachersByGradeId(Integer.valueOf(gradeId));
    }
}
