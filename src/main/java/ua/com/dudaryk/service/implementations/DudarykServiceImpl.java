package ua.com.dudaryk.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.Dudaryk;
import ua.com.dudaryk.model.Voice;
import ua.com.dudaryk.repository.interfaces.DudarykDAO;
import ua.com.dudaryk.service.interfaces.DudarykService;


import java.util.List;

@Service
@Transactional
public class DudarykServiceImpl implements DudarykService {

    private DudarykDAO dudarykDAO;

    public DudarykServiceImpl(DudarykDAO dudarykDAO) {
        this.dudarykDAO = dudarykDAO;
    }

    public Dudaryk save(Dudaryk dudaryk) {
        return dudarykDAO.saveDudaryk(dudaryk);
    }

    public Dudaryk update(Dudaryk dudaryk) {
        return dudarykDAO.updateDudaryk(dudaryk);
    }

    public void delete(Long id) {
        dudarykDAO.deleteDudaryk(dudarykDAO.findDudarykById(id));
    }

    public Dudaryk findById(Long id) {
        return dudarykDAO.findDudarykById(id);
    }

    public List<Dudaryk> findAll() {
        return dudarykDAO.findAllDudaryks();
    }

    @Override
    public List<Dudaryk> findByName(String name) {
        return dudarykDAO.findByName(name);
    }

    @Override
    public List<Dudaryk> findByLastName(String lastName) {
        return dudarykDAO.findByLastName(lastName);
    }

    @Override
    public List<Dudaryk> findByVoice(Voice voice) {
        return dudarykDAO.findByVoice(voice);
    }

    @Override
    public List<Dudaryk> findAction() {
        return dudarykDAO.findAction();
    }

    @Override
    public List<Dudaryk> findByConcert(Long id) {
        return dudarykDAO.findByConcert(id);

    }
}
