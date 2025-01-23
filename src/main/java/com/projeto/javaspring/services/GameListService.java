package com.projeto.javaspring.services;

import com.projeto.javaspring.dto.GameListDTO;
import com.projeto.javaspring.entities.GameList;
import com.projeto.javaspring.projections.GameMinProjection;
import com.projeto.javaspring.repositories.GameListRepository;
import com.projeto.javaspring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for(int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId,list.get(i).getId(),i);
        }
    }
}
