package com.devsuperior.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devsuperior.entities.Score;
import com.devsuperior.devsuperior.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
	}