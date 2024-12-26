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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nuri.workers.test.dto.StudentDto;
import com.nuri.workers.test.service.StudentService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;
    
    @GetMapping("/list")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok().body(studentService.getAllStudents());
    }
    
    @GetMapping("/get/{id}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable Long id) {
        return ResponseEntity.ok().body(studentService.getStudent(id));
    }
    
    @PostMapping("/add")
    public ResponseEntity<StudentDto> addStudent(@RequestBody String name, @RequestParam Long schoolId) {
        return ResponseEntity.ok().body(studentService.saveStudent(name, schoolId));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody String name) {
        return ResponseEntity.ok().body(studentService.updateStudent(id, name));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
    
}
