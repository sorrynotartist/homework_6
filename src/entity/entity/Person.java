package entity.entity;

import java.io.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    public static int id;
    public String name;
    public Date dayOfBirth;
    public String zodiac;
    public int mainArcan;
    public boolean isLikesIriska;

    public Person(int id, String name, Date dayOfBirth, String zodiac, int mainArcan, boolean isLikesIriska) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.zodiac = zodiac;
        this.mainArcan = mainArcan;
        this.isLikesIriska = isLikesIriska;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", zodiac='" + zodiac + '\'' +
                ", mainArcan=" + mainArcan +
                ", isLikesIriska=" + isLikesIriska +
                '}';
    }


    public static void saveTo(Person person, File file) throws IOException {
        try (FileOutputStream stream = new FileOutputStream(file)) {
            try (PrintWriter writer = new PrintWriter(stream)) {
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                String strDate = formatter.format(person.dayOfBirth);
                writer.println(person.id);
                writer.println(person.name);
                writer.println(strDate);
                writer.println(person.zodiac);
                writer.println(person.mainArcan);
                writer.println(person.isLikesIriska);
            }
        }
    }

    public static Person loadFrom(Person person, File file) throws IOException {
        try (FileInputStream stream = new FileInputStream(file)) {
            try (Scanner scanner = new Scanner(stream)) {
                return new Person(
                        new Integer(scanner.nextLine()),
                        scanner.nextLine(),
                        new Date(scanner.nextLine()),
                        scanner.nextLine(),
                        scanner.nextInt(),
                        scanner.nextBoolean()
                );
            }
        }
    }
}