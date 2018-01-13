package ua.com.dudaryk.repository.interfaces;

import ua.com.dudaryk.model.UserHistory;

import java.util.List;

public interface UserHistoryDAO  {

    List<UserHistory> findByDudarykId(Long id);

    List<UserHistory> findAllUH();

    UserHistory saveUH(UserHistory userHistory);

    UserHistory updateUH(UserHistory userHistory);

    UserHistory findByIdUH(Long id);

    void deleteUH(UserHistory userHistory);

}
