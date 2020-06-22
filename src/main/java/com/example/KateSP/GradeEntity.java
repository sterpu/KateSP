package com.example.KateSP;

import javax.persistence.*;

@Entity
@Table(name = "grade")
public class GradeEntity {
    @Override
    public String toString() {
        return "GradeEntity{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;

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

}
