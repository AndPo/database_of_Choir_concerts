package ua.com.dudaryk.repository;

import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.repository.interfaces.AbstractDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {
    private Class<T> clazz;

    @PersistenceContext
    protected EntityManager entityManager;

    protected void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    @Transactional(readOnly = true)
    public T findById(Long id) {
        return entityManager.find(clazz, id);
    }

    @Override
    @Transactional()
    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    @Transactional()
    public T update(T entity) {
       return entityManager.merge(entity);
    }

    @Override
    @Transactional()
    public void delete(T entity) {
        entityManager.remove(entity);
    }

    @Transactional(readOnly = true)
    public List<T> findAll() {
        return entityManager.createQuery("from " + clazz.getName()).getResultList();
    }
}
