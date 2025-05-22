package com.Aramis.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aramis.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	
}

