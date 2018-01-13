package ua.com.dudaryk.repository.interfaces;

import ua.com.dudaryk.model.Participant;

import java.util.List;

public interface ParticipantDAO {

    Participant saveParticipant(Participant participant);

    void deleteParticipant(Participant participant);

    Participant findParticipantById(Long id);

    List<Participant> findByName(String name);

}
