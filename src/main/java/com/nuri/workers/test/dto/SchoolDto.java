package com.nuri.workers.test.dto;

import java.util.List;

import com.nuri.workers.test.entity.School;
import com.nuri.workers.test.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SchoolDto {

    private Long id;
    private String name;
    private List<Student> student;

    public School toEntity(){
        return School.builder()
            .id(this.id)
            .name(this.name)
            .student(this.student)
            .build();
    }
    
}
