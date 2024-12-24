package com.nuri.workers.test.entity;

import com.nuri.workers.test.dto.SchoolDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    public School(String schName){
        this.schName = schName;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schId;

    @Column(name = "name", nullable = false, length = 100)
    private String schName;

    public SchoolDto toDto(){
        return SchoolDto.builder()
            .id(this.schId)
            .name(this.schName)
            .build();
    }
}
