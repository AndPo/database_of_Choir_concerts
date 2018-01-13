package ua.com.dudaryk.repository.implementations;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.Dudaryk;
import ua.com.dudaryk.model.Voice;
import ua.com.dudaryk.repository.AbstractDAOImpl;
import ua.com.dudaryk.repository.interfaces.DudarykDAO;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
@Transactional
public class DudarykDAOImpl extends AbstractDAOImpl<Dudaryk> implements DudarykDAO {

    @PostConstruct
    private void init() {
        setClazz(Dudaryk.class);
    }

    @Override
    public void setClazz(Class<Dudaryk> clazzToSet) {
        super.setClazz(clazzToSet);
    }

    @Override
    public Dudaryk saveDudaryk(Dudaryk dudaryk) {
        return save(dudaryk);
    }

    @Override
    public Dudaryk updateDudaryk(Dudaryk dudaryk) {
        return update(dudaryk);
    }

    @Override
    public void deleteDudaryk(Dudaryk dudaryk) {
        super.delete(dudaryk);
    }

    @Override
    public Dudaryk findDudarykById(Long id) {
        return findById(id);
    }

    @Override
    public List<Dudaryk> findAllDudaryks() {
        return findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Dudaryk> findByName(String name) {
        String query = "select Dudaryk from dudaryk  where Dudaryk.NAME=" + name;
        return entityManager.createQuery(query).getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Dudaryk> findByLastName(String lastName) {
        String query = "select Dudaryk from dudaryk  where Dudaryk.LASTNAME=" + lastName;
        return entityManager.createQuery(query).getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Dudaryk> findByVoice(Voice voice) {
        String query = "select Dudaryk from dudaryk  where Dudaryk.Voice =" + voice;
        return entityManager.createQuery(query).getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Dudaryk> findAction() {
        String query = "select Dudaryk from dudaryk  where Dudaryk.IS_ACTION=" + true;
        return entityManager.createQuery(query).getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Dudaryk> findByConcert(Long id) {
        String query = "select Dudaryk from dudaryk  where Dudaryk.CONCERT_ID=" + id;
        return entityManager.createQuery(query).getResultList();
    }
}
