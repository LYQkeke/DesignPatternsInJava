package Singleton;

/**
 * Created by KEKE on 2019/5/10
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--单例模式--");
        SingletonDemo instance1 = SingletonDemo.getInstance1();
        SingletonDemo instance2 = SingletonDemo.getInstance1();
        System.out.println(instance1.getId());
        System.out.println(instance2.getId());
        SingletonDemo instance3 = SingletonDemo.getInstance2();
        SingletonDemo instance4 = SingletonDemo.getInstance2();
        System.out.println(instance3.getId());
        System.out.println(instance4.getId());
        SingletonDemo instance5 = SingletonDemo.getInstance3();
        SingletonDemo instance6 = SingletonDemo.getInstance3();
        System.out.println(instance5.getId());
        System.out.println(instance6.getId());
        SingletonDemo instance7 = SingletonDemo.getInstance4();
        SingletonDemo instance8 = SingletonDemo.getInstance4();
        System.out.println(instance7.getId());
        System.out.println(instance8.getId());
    }
}
