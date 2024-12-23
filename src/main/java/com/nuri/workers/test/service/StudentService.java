package com.nuri.workers.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nuri.workers.test.entity.School;
import com.nuri.workers.test.entity.Student;
import com.nuri.workers.test.respository.SchoolRepository;
import com.nuri.workers.test.respository.StudentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final SchoolRepository schoolRepository;

    public Student saveStudent(String name, Long schoolId) {
        School school = schoolRepository.findById(schoolId).orElseThrow(() -> new IllegalArgumentException("Invalid school Id:" + schoolId));
        Student student = new Student(name);
        student.setSchool(school);
        return studentRepository.save(student);
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Long id, String name) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        student.setName(name);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    
}