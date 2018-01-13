package ua.com.dudaryk.repository.interfaces;

import ua.com.dudaryk.model.Communication;

import java.time.LocalDateTime;
import java.util.List;

public interface CommunicationDAO  {

    Communication findByCommunicationId(Long id);

    Communication saveCommunication(Communication communication);

    Communication updateCommunication(Communication communication);

    void deleteCommunication(Communication communication);

    List<Communication> findAllCommunication();

    List<Communication> findByConcertId(Long id);

    List<Communication> findByMembershipDate(LocalDateTime date);

    List<Communication> findByName(String name);
}
