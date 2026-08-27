package com.kachepasimon.studentprofile;

import com.kachepasimon.student.Student;
import jakarta.persistence.*;

@Entity
@Table(name="student_profiles")
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String studentBio;
    @OneToOne()
    @JoinColumn(
            name="student_id"
    )
    private Student student;

    public StudentProfile() {
    }

    public StudentProfile(String studentBio) {
        this.studentBio = studentBio;
    }

    public String getStudentBio() {
        return studentBio;
    }

    public void setStudentBio(String studentBio) {
        this.studentBio = studentBio;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
