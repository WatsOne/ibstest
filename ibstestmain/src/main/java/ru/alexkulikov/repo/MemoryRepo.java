package ru.alexkulikov.repo;

import ru.alexkulikov.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class MemoryRepo<T extends BaseEntity> implements CrudRepo<T> {
    List<T> entities;

    MemoryRepo() {
        entities = new ArrayList<>();
    }

    @Override
    public T get(long i) {
        return entities.stream().filter(e -> e.getId() == i).findFirst().orElse(null);
    }

    @Override
    public List<T> getAll() {
        return entities;
    }

    @Override
    public void delete(long i) {
        T foundEntity = get(i);
        if (foundEntity != null) {
            entities.remove(foundEntity);
        }
    }

    @Override
    public void create(T entity) {
        entities.add(entity);
    }

    @Override
    public void update(T entity) {
        entities.stream().filter(e -> e.getId() == entity.getId()).forEach(e -> e = entity);
    }
}
