package repository;

import entity.entity.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MemoryRepository<T> implements Repository<T>{

    Map<Integer, T> storage;
    abstract int getId (T obj);

    public MemoryRepository() {
        this.storage = new HashMap<Integer, T>();
    }

    @Override
    public void save(T abs) throws IOException {
        storage.put(this.getId(abs), abs);

    }

    public T load(int id) throws IOException {
        return this.storage.get(id);
    }

    @Override
    public List<T> load(List<Integer> ids) throws IOException {
        List<T> list = new ArrayList<T>();
        for (int id:ids) {
            list.add(this.load(id));
        }

        return null;
    }
}
