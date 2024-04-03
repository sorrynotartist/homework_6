package repository;

import entity.entity.Person;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DirectoryPersonRepository implements Repository<Person> {
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

    public void save(Object person) throws IOException {
        String nameOfFile;
        nameOfFile = Integer.toString(person.ids);
        File fileId = new File(this.dir, nameOfFile + ".txt");
        Person.saveTo((Person) person, fileId);
    }

    @Override
    public void save(Person abs) throws IOException {

    }

    public List<Person> load(List<Integer> ids) throws IOException {
        List<Person> personList = new ArrayList<>();
        for (int id:ids) {
            File fileId = new File(this.dir, id + ".txt");
            personList.add (Person.loadFrom(new Person(), fileId));
        }
        return personList;
    }

}
