package com.projeto.javaspring.repositories;

import com.projeto.javaspring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository  extends JpaRepository<Game, Long> {

}
