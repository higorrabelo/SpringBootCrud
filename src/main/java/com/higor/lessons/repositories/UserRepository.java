package com.higor.lessons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higor.lessons.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	

}
