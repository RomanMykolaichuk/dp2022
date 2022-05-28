package knu.fit.mit.rest1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import knu.fit.mit.rest1.entity.User;


public interface rest1repo extends JpaRepository<User, Integer>{
	

}