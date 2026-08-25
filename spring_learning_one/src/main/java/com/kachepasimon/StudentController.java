package com.kachepasimon;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping
    public StudentResponseDto createStudent(
            @RequestBody StudentDto studentDto
    ) {
        var student = toStudent(studentDto);
        var savedStudent = studentRepository.save(student);
        return toStudentResponseDto(savedStudent);
    }

    public Student toStudent(StudentDto dto) {
        var student = new Student();
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());
        student.setAge(dto.age());

        var school = new School();
        school.setSchoolId(dto.schoolId());

        student.setSchool(school);

        return student;
    }

    public StudentResponseDto toStudentResponseDto(Student student) {
        return new StudentResponseDto(
                student.getFirstName(),
                student.getFirstName(),
                student.getEmail()
        );
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/search/by-id/{student-id}")
    public Student getStudentById(
            @PathVariable("student-id")  Integer studentId
    ) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @GetMapping("/search/by-name/{student-firstname}")
    public Student getStudentsByFirstName(
            @PathVariable("student-firstname")  String firstName
    ) {
        return studentRepository.findAllByFirstNameContaining(firstName);
    }

    @DeleteMapping("/{student-id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteStudentById(
            @PathVariable("student-id")  Integer studentId
    ) {
        studentRepository.deleteById(studentId);
    }


}
