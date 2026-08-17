package com.kachepasimon;

import org.springframework.http.HttpStatus;
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
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/search/by-id/{student-id}")
    public Student getStudentById(
            @PathVariable("student-id")  Integer studentId
    ) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @GetMapping("/students/search/by-name/{student-firstname}")
    public Student getStudentsByFirstName(
            @PathVariable("student-firstname")  String firstName
    ) {
        return studentRepository.findAllByFirstNameContaining(firstName);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteStudentById(
            @PathVariable("student-id")  Integer studentId
    ) {
        studentRepository.deleteById(studentId);
    }


}
