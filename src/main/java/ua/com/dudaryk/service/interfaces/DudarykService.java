package ua.com.dudaryk.service.interfaces;

import ua.com.dudaryk.model.Dudaryk;
import ua.com.dudaryk.model.Voice;
import ua.com.dudaryk.service.dto.DudarykDTO;

import java.util.List;

public interface DudarykService {

    List<Dudaryk> findByName(String name);

    List<Dudaryk> findByLastName(String lastName);

    List<Dudaryk> findByVoice(Voice voice);

    List<Dudaryk> findAction();

    List<Dudaryk> findByConcert(Long id);

    Dudaryk save(Dudaryk dudaryk);

    Dudaryk update(Dudaryk dudaryk);

    void delete(Long id);

    Dudaryk findById(Long id);

    List<Dudaryk> findAll();
}
