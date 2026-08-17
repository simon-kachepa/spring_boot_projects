package com.kachepasimon;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/students")
    public Student createStudent(
            @RequestBody Student student
    ) {
        return studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/search/{student-id}")
    public Student createStudent(
            @PathVariable("student-id")  Integer studentId
    ) {
        return studentRepository.findById(studentId).orElse(null);
    }


}
