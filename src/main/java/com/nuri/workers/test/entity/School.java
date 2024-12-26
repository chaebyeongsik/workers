package com.nuri.workers.test.entity;

import java.util.List;

import com.nuri.workers.test.dto.SchoolDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class School {

    public School(String name){
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "school")
    private List<Student> student;

    public SchoolDto toDto(){
        return SchoolDto.builder()
            .id(this.id)
            .name(this.name)
            .student(this.student)
            .build();
    }
}
