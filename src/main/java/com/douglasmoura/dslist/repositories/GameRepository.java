package com.douglasmoura.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasmoura.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {


}