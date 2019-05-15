package Memento;

/**
 * Created by KEKE on 2019/5/15
 */
public class Main {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Person p = new Person("CXK",12);
        p.display();
        int index = careTaker.add(p.getMemento());
        p.setAge(22);
        p.setName("蔡徐坤");
        p.display();
        p.setState(careTaker.get(index));
        p.display();
    }
}
