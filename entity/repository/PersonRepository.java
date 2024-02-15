package entity.entity.repository;

import entity.entity.Person;

import java.io.IOException;

public interface PersonRepository {

    static void save(Person person) throws IOException {
    }

    static Person load(int id) throws IOException {
        return null;
    }

}
