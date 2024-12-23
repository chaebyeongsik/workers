package com.nuri.workers.test.dto;

import com.nuri.workers.test.entity.Student;
import com.nuri.workers.test.entity.School;

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
    private School team;

    public Student toEntity(){
        return Student.builder()
            .id(this.id)
            .name(this.name)
            .build();
    }

}