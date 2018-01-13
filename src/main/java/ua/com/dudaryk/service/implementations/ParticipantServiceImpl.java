package ua.com.dudaryk.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.Participant;
import ua.com.dudaryk.repository.interfaces.ParticipantDAO;
import ua.com.dudaryk.service.interfaces.ParticipantService;
import ua.com.dudaryk.service.dto.ParticipantDTO;


import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ParticipantServiceImpl implements ParticipantService {

    private ParticipantDAO participantDAO;

    @Autowired
    public ParticipantServiceImpl(ParticipantDAO participantDAO) {
        this.participantDAO = participantDAO;
    }


    public Participant save(Participant participant) {
        return participantDAO.saveParticipant(participant);
    }

    public void delete(Long id) {
        participantDAO.deleteParticipant(participantDAO.findParticipantById(id));
    }

    public Participant findById(Long id) {
        return participantDAO.findParticipantById(id);
    }

    @Override
    public List<Participant> findByName(String name) {
        return participantDAO.findByName(name);

    }
}
