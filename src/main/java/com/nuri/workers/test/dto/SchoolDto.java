package com.nuri.workers.test.dto;

import com.nuri.workers.test.entity.School;

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

    public School toEntity(){
        return School.builder()
            .id(this.id)
            .name(this.name)
            .build();
    }
    
}
