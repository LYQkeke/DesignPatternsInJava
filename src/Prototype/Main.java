package Prototype;

/**
 * Created by KEKE on 2019/5/11
 *
 * 原型模式其实就是对 对象的克隆操作
 */
public class Main {

    public static void main(String[] args) {

        Person p = new Person();
        System.out.println(p);

        Person pp = p.clone();
        p.getFriends().add("Steve Jobs");
        System.out.println(p);
        pp.getFriends().add("Bill Gates");
        System.out.println(pp);
    }
}
