package com.douglasmoura.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douglasmoura.dslist.entities.Game;
import com.douglasmoura.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional(readOnly = true)
	public List<Game> findAll() {
		List<Game> result = gameRepository.findAll();
		return result;
	}
	
}