package ua.com.dudaryk.repository.interfaces;

import java.io.Serializable;
import java.util.List;

public interface AbstractDAO<T> {

    T findById(Long id);

    T save(T entity);

    T update(T entity);

    void delete(T entity);

    List<T> findAll();


}
