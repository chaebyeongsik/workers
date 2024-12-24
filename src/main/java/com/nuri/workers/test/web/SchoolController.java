package com.nuri.workers.test.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuri.workers.test.dto.SchoolDto;
import com.nuri.workers.test.service.SchoolService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/school")
public class SchoolController {

    private final SchoolService schoolService;
    
    @GetMapping("/list")
    public ResponseEntity<List<SchoolDto>> getAllSchools() {
        return ResponseEntity.ok().body(schoolService.getAllSchools());
    }
    
    @GetMapping("/get/{id}")
    public ResponseEntity<SchoolDto> getSchool(@PathVariable Long id) {
        return ResponseEntity.ok().body(schoolService.getSchool(id));
    }
    
    @PostMapping("/add")
    public ResponseEntity<SchoolDto> addSchool(@RequestBody SchoolDto dto) throws Exception {
        return ResponseEntity.ok().body(schoolService.saveSchool(dto));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<SchoolDto> updateSchool(@PathVariable Long id, @RequestBody SchoolDto dto)throws Exception {
        return ResponseEntity.ok().body(schoolService.updateSchool(id, dto));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSchool(@PathVariable Long id)throws Exception {
        schoolService.deleteSchool(id);
    }
    
}
