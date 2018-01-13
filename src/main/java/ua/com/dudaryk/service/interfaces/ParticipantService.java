package ua.com.dudaryk.service.interfaces;

import ua.com.dudaryk.model.Participant;
import ua.com.dudaryk.service.dto.ParticipantDTO;

import java.util.List;

public interface ParticipantService {

    List<Participant> findByName(String name);

    Participant save(Participant participant);

    void delete(Long id);

    Participant findById(Long id);
}
