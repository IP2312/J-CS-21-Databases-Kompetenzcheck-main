package org.example.dao;

public interface DAO <T> {
    T get(int id);

    int insert(T t);

    int update(T t);

    int delete(int id);
}
