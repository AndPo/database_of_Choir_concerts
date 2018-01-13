package ua.com.dudaryk.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.UserHistory;
import ua.com.dudaryk.repository.interfaces.UserHistoryDAO;
import ua.com.dudaryk.service.interfaces.UserHistoryService;
import ua.com.dudaryk.service.dto.UserHistoryDTO;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserHistoryServiceImpl implements UserHistoryService {


    private UserHistoryDAO userHistoryDAO;

    @Autowired
    public UserHistoryServiceImpl(UserHistoryDAO userHistoryDAO) {
        this.userHistoryDAO = userHistoryDAO;
    }

    public UserHistory save(UserHistory userHistory) {
        return userHistoryDAO.saveUH(userHistory);
    }

    public UserHistory update(UserHistory userHistory) {
        return userHistoryDAO.updateUH(userHistory);
    }

    public void delete(Long id) {
        userHistoryDAO.deleteUH(userHistoryDAO.findByIdUH(id));
    }

    public UserHistory findById(Long id) {
        return userHistoryDAO.findByIdUH(id);
    }

    public List<UserHistory> findAll() {
        return userHistoryDAO.findAllUH();
    }

    public List<UserHistory> findByDudarykId(Long id) {
        return userHistoryDAO.findByDudarykId(id);
    }


}
