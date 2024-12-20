package com.nuri.workers.test.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nuri.workers.test.dto.ImAdmUserDto;
import com.nuri.workers.test.service.ImAdmUserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController("/imAdmUser")
public class ImAdmUserController {

    private final ImAdmUserService svc;
    
    @GetMapping("/selectList")
    public ResponseEntity<List<ImAdmUserDto>> selectList() {
        return ResponseEntity.ok().body(svc.selectList());
    }
    
    @GetMapping("/selectOne")
    public ResponseEntity<ImAdmUserDto> selectOne(@RequestParam Long idx) {
        return ResponseEntity.ok().body(svc.selectOne(idx));
    }
    
    @PostMapping("/selectOne")
    public ResponseEntity<ImAdmUserDto> selectOne(@RequestBody ImAdmUserDto dto) {
        return ResponseEntity.ok().body(svc.selectOne(dto));
    }

}
