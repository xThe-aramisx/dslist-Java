package com.Aramis.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Aramis.dslist.dto.GameDTO;
import com.Aramis.dslist.dto.GameMinDTO;
import com.Aramis.dslist.entities.Game;
import com.Aramis.dslist.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	public GameRepository gameRepository;
	
	@Transactional(readOnly = true) 
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO (result);  //pode so deixar em "return new GameDTO (result)"
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
