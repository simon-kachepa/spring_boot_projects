package com.kachepasimon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student-profiles")
public class StudentProfileController {

    private final StudentProfileRepository studentProfileRepository;

    public StudentProfileController(StudentProfileRepository studentProfileRepository) {
        this.studentProfileRepository = studentProfileRepository;
    }

    @GetMapping
    public List<StudentProfile> getAllStudentProfiles() {
        return studentProfileRepository.findAll();
    }
}
