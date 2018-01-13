package ua.com.dudaryk.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.Concert;
import ua.com.dudaryk.repository.interfaces.ConcertDAO;
import ua.com.dudaryk.service.interfaces.ConcertService;


import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ConcertServiceImpl implements ConcertService {

    private ConcertDAO concertDAO;


    @Autowired
    public ConcertServiceImpl(ConcertDAO concertDAO) {
        this.concertDAO = concertDAO;
    }

    public Concert save(Concert concert) {
        return concertDAO.saveConcert(concert);
    }

    public Concert update(Concert concert) {
        return concertDAO.updateConcert(concert);
    }

    public void delete(Long id) {
        concertDAO.deleteConcert(concertDAO.findConcertById(id));
    }

    public Concert findById(Long id) {
        return concertDAO.findConcertById(id);
    }

    public List<Concert> findAll() {
        return concertDAO.findAllConcerts();
    }

    @Override
    public List<Concert> findByName(String name) {
        return concertDAO.findByName(name);
    }

    @Override
    public List<Concert> findByDate(LocalDateTime date) {
        return concertDAO.findByDate(date);
    }

    @Override
    public List<Concert> findByParticipant(Long id) {
        return concertDAO.findByParticipant(id);
    }
}
