package Mediator;

/**
 * Created by KEKE on 2019/5/14
 */
public abstract class Person {

    private String name;

    private int condition;

    public Person(String name, int condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public int getCondition() {
        return condition;
    }
}
