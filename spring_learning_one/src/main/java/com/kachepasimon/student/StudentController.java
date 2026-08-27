package com.kachepasimon.student;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentResponseDto saveStudent(
            @Valid @RequestBody StudentDto studentDto
    ) {
        return this.studentService.saveStudent(studentDto);
    }


    @GetMapping
    public List<StudentResponseDto> findAllStudents() {

        return  this.studentService.findAllStudents();
    }

    @GetMapping("/search/by-id/{student-id}")
    public StudentResponseDto findStudentById(
            @PathVariable("student-id")  Integer studentId
    ) {
        return studentService.findStudentById(studentId);
    }

    @GetMapping("/search/by-name/{student-firstname}")
    public List<StudentResponseDto> getStudentsByFirstName(
            @PathVariable("student-firstname")  String firstName
    ) {
        return studentService.findAllStudentsByFirstName(firstName);
    }

    @DeleteMapping("/{student-id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteStudentById(
            @PathVariable("student-id")  Integer studentId
    ) {
        studentService.deleteStudentById(studentId);
    }

}
