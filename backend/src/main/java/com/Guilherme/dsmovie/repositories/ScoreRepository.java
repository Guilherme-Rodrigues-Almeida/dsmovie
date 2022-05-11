package com.Guilherme.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Guilherme.dsmovie.entities.Score;
import com.Guilherme.dsmovie.entities.ScorePK;

public interface ScoreRepository  extends JpaRepository<Score, ScorePK>{

}