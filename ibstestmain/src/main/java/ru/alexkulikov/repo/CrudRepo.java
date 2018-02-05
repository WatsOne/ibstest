package ru.alexkulikov.repo;

import ru.alexkulikov.entity.BaseEntity;

import java.util.List;

public interface CrudRepo<T extends BaseEntity> {

    List<T> getAll();

    T get(long i);

    void update(T entity);

    void delete(long i);

    void create(T entity);
}
