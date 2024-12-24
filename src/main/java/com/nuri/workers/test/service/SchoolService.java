package com.nuri.workers.test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nuri.workers.test.dto.SchoolDto;
import com.nuri.workers.test.entity.School;
import com.nuri.workers.test.respository.SchoolRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;
    
    public List<SchoolDto> getAllSchools() {
        return schoolRepository.findAll().stream().map(m->m.toDto()).collect(Collectors.toList());
    }
    
    public SchoolDto getSchool(Long id) {
        return schoolRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("## Invalid school Id:" + id)).toDto();
    }
    
    public SchoolDto saveSchool(SchoolDto dto) throws Exception {
        /*if( schoolRepository.findById(dto.getId()).isPresent() == true ){
            throw new Exception("## Invalid school Id:" + dto.getId());
        }
        */
        return schoolRepository.save(dto.toEntity()).toDto();
    }
    
    public SchoolDto updateSchool(Long id, SchoolDto dto) throws Exception {
        schoolRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("## Invalid school Id:" + id));
        return schoolRepository.save(dto.toEntity()).toDto();
    }

    public void deleteSchool(Long id) throws Exception {
        School school = schoolRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("## Invalid school Id:" + id));
        schoolRepository.deleteById(school.getId());
    }
    
}