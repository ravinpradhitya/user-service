package com.englishlearning.user_service.Repository;

import com.englishlearning.user_service.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer> {
}
