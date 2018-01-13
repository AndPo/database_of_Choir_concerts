package ua.com.dudaryk.repository.interfaces;

import ua.com.dudaryk.model.Dudaryk;
import ua.com.dudaryk.model.Voice;

import java.util.List;

public interface DudarykDAO {


    Dudaryk saveDudaryk(Dudaryk dudaryk);

    Dudaryk updateDudaryk(Dudaryk dudaryk);

    void deleteDudaryk(Dudaryk dudaryk);

    Dudaryk findDudarykById(Long id);

    List<Dudaryk> findAllDudaryks();

    List<Dudaryk> findByName(String name);

    List<Dudaryk> findByLastName(String lastName);

    List<Dudaryk> findByVoice(Voice voice);

    List<Dudaryk> findAction();

    List<Dudaryk> findByConcert(Long id);

}
