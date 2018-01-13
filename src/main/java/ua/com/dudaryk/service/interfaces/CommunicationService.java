package ua.com.dudaryk.service.interfaces;

import ua.com.dudaryk.model.Communication;
import ua.com.dudaryk.service.dto.CommunicationDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface CommunicationService {

    List<Communication> findByConcertId(Long id);

    List<Communication> findByMembershipDate(LocalDateTime date);

    List<Communication> findByName(String name);

    Communication findById(Long id);

    Communication save(Communication communication);

    Communication update(Communication communication);

    void delete(Long id);

    List<Communication> findAll();
}
