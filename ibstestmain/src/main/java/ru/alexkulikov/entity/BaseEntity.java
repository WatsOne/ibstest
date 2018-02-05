package ru.alexkulikov.entity;

public abstract class BaseEntity {
    private long id;

    BaseEntity() {
        id = System.nanoTime();
    }

    public long getId() {
        return id;
    }
}
