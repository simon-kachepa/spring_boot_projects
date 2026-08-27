package com.kachepasimon.school;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping
    public SchoolDto saveSchool(@RequestBody SchoolDto dto) {

        return this.schoolService.saveSchool(dto);
    }

    @GetMapping
    public List<SchoolDto> findAllSchools() {

        return this.schoolService.findAllSchools();
    }

    @GetMapping("/{id}")
    public SchoolDto findSchoolById(@PathVariable Integer id) {

        return schoolService.findSchoolById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteSchoolById(@PathVariable Integer id) {
        schoolService.deleteSchoolById(id);
    }

    @PutMapping
    public SchoolDto updateSchool(@RequestBody SchoolDto dto) {

        return schoolService.updateSchool(dto);
    }
}
