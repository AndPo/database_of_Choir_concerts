package ua.com.dudaryk.repository.implementations;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.UserHistory;
import ua.com.dudaryk.repository.AbstractDAOImpl;
import ua.com.dudaryk.repository.interfaces.UserHistoryDAO;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
@Transactional
public class UserHistoryDAOImpl extends AbstractDAOImpl<UserHistory> implements UserHistoryDAO {

    @PostConstruct
    private void init() {
        setClazz(UserHistory.class);
    }

    @Override
    public List<UserHistory> findByDudarykId(Long id) {
        String query = "select UserHistory from user_history  where UserHistory.DUDARYK_ID=" + id;
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<UserHistory> findAllUH() {
        return findAll();
    }

    @Override
    public UserHistory saveUH(UserHistory userHistory) {
        return save(userHistory);
    }

    @Override
    public UserHistory updateUH(UserHistory userHistory) {
        return update(userHistory);
    }

    @Override
    public UserHistory findByIdUH(Long id) {
        return findById(id);
    }

    @Override
    public void deleteUH(UserHistory userHistory) {
        super.delete(userHistory);
    }


}
