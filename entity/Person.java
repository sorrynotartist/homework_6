package entity;

import java.util.Date;

public class Person {
    int id;
    String name;
    Date dayOfBirth;
    String zodiac;
    int mainArcan;
    boolean isLikesIriska;

    public Person(int id, String name, Date dayOfBirth, String zodiac, int mainArcan, boolean isLikesIriska) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.zodiac = zodiac;
        this.mainArcan = mainArcan;
        this.isLikesIriska = isLikesIriska;
    }

}
