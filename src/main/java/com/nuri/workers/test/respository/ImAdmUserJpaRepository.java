package com.nuri.workers.test.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuri.workers.test.entity.ImAdmUser;

public interface ImAdmUserJpaRepository extends JpaRepository<ImAdmUser, Long> {
    
}
