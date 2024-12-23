package com.nuri.workers.test.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuri.workers.test.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
