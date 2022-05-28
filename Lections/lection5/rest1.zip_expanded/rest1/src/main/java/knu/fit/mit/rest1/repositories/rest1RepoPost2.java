package knu.fit.mit.rest1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import knu.fit.mit.rest1.entities3.PostComment2;

@Repository
public interface rest1RepoPost2 extends JpaRepository<PostComment2, Long>{
	

}