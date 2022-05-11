package com.Guilherme.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Guilherme.dsmovie.entities.Movie;

public interface MovieRepository  extends JpaRepository<Movie, Long>{

}
