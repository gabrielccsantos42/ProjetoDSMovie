package com.devsuperior.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devsuperior.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
