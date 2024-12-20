package com.nuri.workers.test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nuri.workers.test.dto.ImAdmUserDto;
import com.nuri.workers.test.entity.ImAdmUser;
import com.nuri.workers.test.respository.ImAdmUserJpaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImAdmUserService {
    
    private final ImAdmUserJpaRepository repo;

    public List<ImAdmUserDto> selectList(){
        return repo.findAll().stream().map(ImAdmUser::toDto).collect(Collectors.toList());
    }
    
    public ImAdmUserDto selectOne(ImAdmUserDto dto){
        return this.selectOne(dto.getAdmgrpIdx());
    }
    
    public ImAdmUserDto selectOne(Long idx){
        return repo.findById(idx).orElseGet(ImAdmUser::new).toDto();
    }
}
