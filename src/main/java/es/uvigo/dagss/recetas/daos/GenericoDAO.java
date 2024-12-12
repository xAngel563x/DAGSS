package es.uvigo.dagss.recetas.daos;

import java.util.List;

public interface GenericoDAO<T, ID> {
    T findById(ID id);
    List<T> findAll();
    T save(T entity);
    void delete(ID id);
}
