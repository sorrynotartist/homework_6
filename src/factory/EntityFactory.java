package factory;

import java.io.IOException;

public interface EntityFactory<T> {

    public T create() throws IOException;

}
