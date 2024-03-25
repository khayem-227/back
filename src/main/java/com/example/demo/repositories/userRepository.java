package com.example.demo.repositories;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;


@Repository
public interface userRepository extends JpaRepository<User,Long> {

	
	Optional<User> findByLogin(String login);
	
}
