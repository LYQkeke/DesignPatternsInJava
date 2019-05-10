package Singleton;

/**
 * Created by KEKE on 2019/5/10
 */
public class SingletonDemo {

    private String id;

    // 私有的构造方法
    private SingletonDemo() {
        id = "";
        for (int i = 0; i < 10; i++) {
            id += (int)(Math.random()*10);
        }
    }

    // 饿汉式 -- 线程安全，调用效率高，但是不能延时加载
    /**
     * 一上来就把单例对象创建出来了，要用的时候直接返回即可，
     * 这种可以说是单例模式中最简单的一种实现方式。
     * 但是问题也比较明显。单例在还没有使用到的时候，初始化就已经完成了。
     * 也就是说，如果程序从头到位都没用使用这个单例的话，单例的对象还是会创建。
     * 这就造成了不必要的资源浪费。所以不推荐这种实现方式
     */
    private static final SingletonDemo instance1 = new SingletonDemo();
    public static SingletonDemo getInstance1(){
        return instance1;
    }

    // 懒汉式 --
    private static SingletonDemo instance2;
    // 方法同步调用效率低
    public static synchronized SingletonDemo getInstance2(){
        if (instance2==null)
            instance2 = new SingletonDemo();
        return instance2;
    }

    // 双重检查 --
    private static SingletonDemo instance3;
    public static SingletonDemo getInstance3(){
        if (instance3==null){
            // 只给创建实例的部分进行同步，仅仅在instance为空的时候进行同步，
            // 一但对象不为空之后就不再进行同步，所以说在性能上有提升
            synchronized (SingletonDemo.class){
                if (instance3==null)
                    instance3 = new SingletonDemo();
            }
        }
        return instance3;
    }

    // 静态内部类 --
    private static class SingletonClassInstance{
        private static final SingletonDemo instance = new SingletonDemo();
    }

    public static SingletonDemo getInstance4(){
        return SingletonClassInstance.instance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
