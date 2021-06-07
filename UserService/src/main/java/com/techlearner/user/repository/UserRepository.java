package com.techlearner.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techlearner.user.entity.User_Entity;


public interface UserRepository extends JpaRepository<User_Entity, Long> {

	User_Entity findByUserId(long userId);

}
