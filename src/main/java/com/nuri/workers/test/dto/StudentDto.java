package com.nuri.workers.test.dto;

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
public class StudentDto {
    
    private Long id;
    private String name;
    private School school;

    public Student toEntity(){
        return Student.builder()
            .id(this.id)
            .name(this.name)
            .school(this.school)
            .build();
    }

}
