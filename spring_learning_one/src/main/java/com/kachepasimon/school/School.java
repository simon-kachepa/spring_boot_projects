package com.kachepasimon.school;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.kachepasimon.student.Student;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="schools")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(
            mappedBy="school",
            cascade = CascadeType.ALL
    )
    @JsonManagedReference
    //@JsonIgnoreProperties("school")
    private List<Student> student;

    public School() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
