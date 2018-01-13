package ua.com.dudaryk.repository.implementations;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.Communication;
import ua.com.dudaryk.repository.AbstractDAOImpl;
import ua.com.dudaryk.repository.interfaces.CommunicationDAO;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional
public class CommunicationDAOImpl extends AbstractDAOImpl<Communication> implements CommunicationDAO {

    @PostConstruct
    private void init() {
        setClazz(Communication.class);
    }

    @Override
    public Communication findByCommunicationId(Long id) {
        return findById(id);
    }

    @Override
    public Communication saveCommunication(Communication communication) {
        return save(communication);
    }

    @Override
    public Communication updateCommunication(Communication communication) {
        return update(communication);
    }

    @Override
    public void deleteCommunication(Communication communication) {
        super.delete(communication);
    }

    @Override
    public List<Communication> findAllCommunication() {
        return findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Communication> findByConcertId(Long id) {
        String query = "select Communication from communication  where Communication.CONCERT_ID=" + id;
        return entityManager.createQuery(query).getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Communication> findByMembershipDate(LocalDateTime date) {
        String query = "select Communication from communication  where Communication.DATE_OF_MEMBERSHIP=" + date;
        return entityManager.createQuery(query).getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Communication> findByName(String name) {
        String query = "select Communication from communication  where Communication.NAME=" + name;
        return entityManager.createQuery(query).getResultList();
    }
}
