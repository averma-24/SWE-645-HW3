package com.studentSurvery.surveyform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentSurvery.surveyform.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls,  Integer >{ 
 
}
