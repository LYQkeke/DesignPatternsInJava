package Memento;

/**
 * Created by KEKE on 2019/5/15
 */
public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonMemento getMemento(){
        return new PersonMemento(name,age);
    }

    public void setState(PersonMemento memento){
        this.name = memento.getName();
        this.age = memento.getAge();
    }

    public void display(){
        System.out.println("name: "+name+", age: "+age);
    }
}
