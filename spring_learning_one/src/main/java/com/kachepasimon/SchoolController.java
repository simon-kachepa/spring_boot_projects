package com.kachepasimon;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolRepository schoolRepository;

    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @GetMapping
    public List<SchoolDto> getAllSchools() {

        return schoolRepository.findAll()
                .stream()
                .map(this::toSchoolDto)
                .collect(Collectors.toList());
    }

    private SchoolDto toSchoolDto(School school) {
        return new SchoolDto(school.getName());
    }

    @GetMapping("/{id}")
    public School getSchoolById(@PathVariable Integer id) {
        return schoolRepository.findById(id).orElse(null);
    }
    @PostMapping
    public SchoolDto createSchool(@RequestBody SchoolDto dto) {

        var school = toSchool(dto);
        schoolRepository.save(school);
        return dto;
    }

    private School toSchool(SchoolDto dto) {

        var school = new School();
        school.setName(dto.name());

        return school;
    }

    @PutMapping
    public School updateSchool(@RequestBody School school) {
        return schoolRepository.save(school);
    }
}
