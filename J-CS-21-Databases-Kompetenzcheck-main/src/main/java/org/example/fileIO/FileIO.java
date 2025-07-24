package org.example.fileIO;

import java.io.IOException;

public interface FileIO<T>{
    T read(int id) throws IOException;

    int write(T t);

    int update(T t);

    int delete(int id);
}
