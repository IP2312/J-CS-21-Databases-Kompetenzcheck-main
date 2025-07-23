package org.example.fileIO;

public interface Writer <T>{
    T read(int id);

    int write(T t);

    int update(T t);

    int delete(int id);
}
