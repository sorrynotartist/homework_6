package entity.entity;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class homework_7 {
    public static void main(String[] args) throws IOException {
        promptUser();

//        Person person = new Person(
//                123456789,
//                "Iriska",
//                new Date("12/20/2019"),
//                "Saggitarius",
//                15,
//                true
//        );
//
//        File file = new File("output.txt");
//
//        Person.saveTo(person, file);
//
//        Person catIriska = new Person();
//
//        catIriska = Person.loadFrom(catIriska, file);
    }

    public static void promptUser() throws IOException {
        System.out.println("do you want to load or enter your data?");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        switch (answer) {
            case "load":
                System.out.println("enter file path to load: ");
                String pathToLoad = in.nextLine();
                System.out.println(Person.loadFrom(new Person(), new File(pathToLoad)));
                break;
            case "enter":
                Person person = createNewPerson();
                System.out.println("enter file path to save");
                String pathToSave = in.nextLine();
                Person.saveTo(person, new File(pathToSave));
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
}
