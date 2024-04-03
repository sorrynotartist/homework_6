package repository;

import entity.entity.Product;

import java.io.IOException;
import java.util.List;

public class DirectoryProductRepository implements Repository<Product> {
    @Override
    public void save(Product abs) throws IOException {

    }

    @Override
    public List<Product> load(List<Integer> ids) throws IOException {
        return null;
    }
}
