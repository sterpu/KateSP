package com.example.KateSP;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name="grade_id", nullable=false)
    private GradeEntity grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GradeEntity getGrade() {
        return grade;
    }

    public void setGrade(GradeEntity gradeEntity) {
        this.grade = gradeEntity;
    }

    @Override
    public String toString() {
        return "TeacherEntity{" +
                "id=" + id +
                ", name='" + name +
                ", grade=" + grade.toString() +
                '}';
    }
}
