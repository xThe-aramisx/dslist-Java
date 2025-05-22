package com.Aramis.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aramis.dslist.dto.GameMinDTO;
import com.Aramis.dslist.entities.Game;
import com.Aramis.dslist.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	public GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
