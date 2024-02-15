package repository;

import entity.entity.Person;

import java.io.File;
import java.io.IOException;

public class DirectoryPersonRepository implements PersonRepository {
     File dir;

    public DirectoryPersonRepository(File dir) throws IOException {
        this.dir = dir;
        if (!dir.exists()) {
            try {
                dir.mkdir();
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
            }
    }

    public void save(Person person) throws IOException {
        String nameOfFile = Integer.toString(person.id);
        File fileId = new File(this.dir, nameOfFile + ".txt");
        Person.saveTo(person, fileId);
    }

    public Person load(int id) throws IOException {
        File fileId = new File(this.dir, id + ".txt");
        return Person.loadFrom(new Person(), fileId);
    }



}
