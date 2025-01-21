package com.projeto.javaspring.repositories;

import com.projeto.javaspring.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
