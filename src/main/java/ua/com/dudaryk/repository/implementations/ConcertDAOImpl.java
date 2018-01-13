package ua.com.dudaryk.repository.implementations;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.Concert;
import ua.com.dudaryk.repository.AbstractDAOImpl;
import ua.com.dudaryk.repository.interfaces.ConcertDAO;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional
public class ConcertDAOImpl extends AbstractDAOImpl<Concert> implements ConcertDAO {

    @PostConstruct
    private void init() {
        setClazz(Concert.class);
    }

    @Override
    public Concert saveConcert(Concert concert) {
        return save(concert);
    }

    @Override
    public Concert updateConcert(Concert concert) {
        return update(concert);
    }

    @Override
    public void deleteConcert(Concert concert) {
        super.delete(concert);
    }

    @Override
    public Concert findConcertById(Long id) {
        return findById(id);
    }

    @Override
    public List<Concert> findAllConcerts() {
        return findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Concert> findByName(String name) {
        String query = "select Concert from concert  where Concert.NAME=" + name;
        return entityManager.createQuery(query).getResultList();

    }

    @Transactional(readOnly = true)
    @Override
    public List<Concert> findByDate(LocalDateTime date) {
        String query = "select Concert from concert  where Concert.DATE=" + date;
        return entityManager.createQuery(query).getResultList();

    }

    //???
    @Transactional(readOnly = true)
    @Override
    public List<Concert> findByParticipant(Long id) {
        String query = "select Concert from concert  where Concert.PARTICIPANT_ID=" + id;
        return entityManager.createQuery(query).getResultList();
    }


}
