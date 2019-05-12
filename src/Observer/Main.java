package Observer;

/**
 * Created by KEKE on 2019/5/12
 */
public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.addObserver(new MyObserver());
        p.setAge(2);
        p.setName("hello");
    }
}
