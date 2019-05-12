package Proxy;

/**
 * Created by KEKE on 2019/5/12
 */
public class Main {

    public static void main(String[] args) {

        Image image1 = new RealImage("hello.jpg");
        System.out.println();
        image1.display();
        System.out.println();

        Image image2 = new ProxyImage("halo.jpg");
        System.out.println();
        image2.display();
    }
}
