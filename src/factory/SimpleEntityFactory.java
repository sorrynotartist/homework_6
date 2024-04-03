package factory;

import java.io.IOException;

public class SimpleEntityFactory<T> implements EntityFactory<T> {
    @Override
    public T create() throws IOException {
        return null;
    }
}
