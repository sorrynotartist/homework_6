package entity.entity;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class homework_666 {
    public static void main(String[] args) throws IOException {
        Person person = new Person(
                123456789,
                "Iriska",
                new Date("12/20/2019"),
                "Saggitarius",
                15,
                true
        );

        File file = new File("output.txt");

        Person.saveTo(person, file);

        Person catIriska = new Person();

        catIriska = Person.loadFrom(catIriska, file);
    }

}
