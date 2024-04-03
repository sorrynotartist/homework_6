package repository;

import entity.entity.Person;

import java.io.IOException;
import java.util.List;

public interface Repository <T> {

    void save(T abs) throws IOException;

    List<T> load(List<Integer> ids) throws IOException;

}
