package com.kachepasimon;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public StudentProfile createStudentProfile(@RequestBody StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentProfileById(@PathVariable("id") Integer id) {
        studentProfileRepository.deleteById(id);
    }
}
