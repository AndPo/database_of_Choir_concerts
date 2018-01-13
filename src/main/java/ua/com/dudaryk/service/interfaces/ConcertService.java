package ua.com.dudaryk.service.interfaces;

import ua.com.dudaryk.model.Concert;
import ua.com.dudaryk.service.dto.ConcertDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface ConcertService {

    List<Concert> findByName(String name);

    List<Concert> findByDate(LocalDateTime date);

    List<Concert> findByParticipant(Long id);

    Concert save(Concert concert);

    Concert update(Concert concert);

    void delete(Long id);

    Concert findById(Long id);

    List<Concert> findAll();
}
