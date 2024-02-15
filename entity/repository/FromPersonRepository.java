package entity.entity.repository;

import entity.entity.Person;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class FromPersonRepository implements PersonRepository {

    public static void main(String[] args) throws IOException {
        System.out.println("do you want to load or enter your data?");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        DirectoryPersonRepository dir = new DirectoryPersonRepository(new File("src/repos/itory/"));
        switch (answer) {
            case "load":
                System.out.println("enter your id: ");
                int id = Integer.parseInt(in.nextLine());
                System.out.println(dir.load(id));
                break;
            case "enter":
                Person person = createNewPerson();
                dir.save(person);
        }
        in.close();
    }

    private static Person createNewPerson() {
        Scanner in = new Scanner(System.in);

        System.out.println("enter your id");
        int id = Integer.parseInt(in.nextLine());

        System.out.println("enter your name");
        String name = in.nextLine();

        System.out.println("enter your date of birth");
        Date birthday = new Date(in.nextLine());

        System.out.println("enter your zodiac sign");
        String zodiac = in.nextLine();

        System.out.println("enter your main arcan");
        int arcan = Integer.parseInt(in.nextLine());

        System.out.println("do you like Iriska?");
        boolean like = Boolean.parseBoolean(in.nextLine());

        return new Person(id, name,  birthday, zodiac, arcan, like);
    }

    public static void save(Person person) throws IOException {
        String nameOfFile = Integer.toString(person.id);
        File fileId = new File("src/entity.entity.repository/" + nameOfFile + ".txt");
        Person.saveTo(person, fileId);
    }

    public static Person load(int id) throws IOException {
        File fileId = new File("src/entity.entity.repository/" + id + ".txt");
        return Person.loadFrom(new Person(), fileId);
    }
}
