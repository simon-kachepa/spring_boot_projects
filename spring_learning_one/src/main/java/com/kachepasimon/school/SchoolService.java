package com.kachepasimon.school;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;

    public SchoolService(SchoolRepository schoolRepository, SchoolMapper schoolMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }

    public SchoolDto saveSchool(SchoolDto dto) {

        var school = schoolMapper.toSchool(dto);
        schoolRepository.save(school);
        return dto;
    }

    public List<SchoolDto> findAllSchools() {

        return schoolRepository.findAll()
                .stream()
                .map(schoolMapper::toSchoolDto)
                .collect(Collectors.toList());
    }

    public SchoolDto findSchoolById(Integer id) {

        return schoolRepository.findById(id)
                .map(schoolMapper::toSchoolDto)
                .orElse(null);
    }

    public SchoolDto updateSchool(SchoolDto dto) {
        var  school = schoolMapper.toSchool(dto);
        schoolRepository.save(school);
        return dto;
    }

    public void deleteSchoolById(Integer id) {
        schoolRepository.deleteById(id);
    }
}
