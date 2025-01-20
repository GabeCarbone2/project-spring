package com.projeto.javaspring.services;

import com.projeto.javaspring.dto.GameMinDTO;
import com.projeto.javaspring.entities.Game;
import com.projeto.javaspring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository; //injetando um componente no outro

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}