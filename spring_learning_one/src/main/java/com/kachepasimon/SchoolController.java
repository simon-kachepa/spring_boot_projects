package com.kachepasimon;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolRepository schoolRepository;

    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @GetMapping
    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    @GetMapping("/{id}")
    public School getSchoolById(@PathVariable Integer id) {
        return schoolRepository.findById(id).orElse(null);
    }
    @PostMapping
    public School createSchool(@RequestBody School school) {
        return schoolRepository.save(school);
    }

    @PutMapping
    public School updateSchool(@RequestBody School school) {
        return schoolRepository.save(school);
    }
}
