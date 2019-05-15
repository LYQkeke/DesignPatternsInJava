package Memento;

/**
 * Created by KEKE on 2019/5/15
 */
public class PersonMemento {

    private String name;

    private int age;

    public PersonMemento(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
