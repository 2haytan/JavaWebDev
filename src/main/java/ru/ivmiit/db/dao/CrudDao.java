package ru.ivmiit.db.dao;

import ru.ivmiit.db.models.User;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> {
    Optional<User> find(Integer id);
    void save(T model);
    void update(T model);
    void delete(Integer id);

    List<T> findAll();
}
