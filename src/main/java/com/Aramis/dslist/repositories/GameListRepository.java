package com.Aramis.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aramis.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}

