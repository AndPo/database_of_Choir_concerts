package ua.com.dudaryk.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.Communication;


import ua.com.dudaryk.repository.interfaces.CommunicationDAO;
import ua.com.dudaryk.service.interfaces.CommunicationService;
import ua.com.dudaryk.service.dto.CommunicationDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CommunicationServiceImpl implements CommunicationService {

    private CommunicationDAO communicationDAO;

    @Autowired
    public CommunicationServiceImpl(CommunicationDAO communicationDAO) {

        this.communicationDAO = communicationDAO;
    }

    public Communication findById(Long id) {
        return communicationDAO.findByCommunicationId(id);
    }


    public Communication save(Communication communication) {
        return communicationDAO.saveCommunication(communication);
    }

    public Communication update(Communication communication) {
        return communicationDAO.updateCommunication(communication);
    }

    public void delete(Long id) {
        communicationDAO.deleteCommunication(communicationDAO.findByCommunicationId(id));
    }


    public List<Communication> findAll() {
        return communicationDAO.findAllCommunication();
    }

    @Override
    public List<Communication> findByConcertId(Long id) {
        return communicationDAO.findByConcertId(id);
    }

    @Override
    public List<Communication> findByMembershipDate(LocalDateTime date) {
        return communicationDAO.findByMembershipDate(date);
    }

    @Override
    public List<Communication> findByName(String name) {
        return communicationDAO.findByName(name);
    }
}
