package singleton;

import java.lang.reflect.Constructor;

/**
 * 使用 双重锁定  创建单例
 */
public class Singleton1 {
    private volatile static Singleton1 singleton1 = null;

    private Singleton1(){
        //防止单例被反射破坏，  但是如果 反射在单例使用 之前调用 则无效
        if(singleton1 != null){
            throw new RuntimeException("单例结构被破坏！");
        }
    }

    public static Singleton1 getSingleton1(){
        if(singleton1 == null){
            synchronized (Singleton1.class){
                if(singleton1 == null){
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }



    public static void main(String[] args) throws Exception {
        Singleton1 one = Singleton1.getSingleton1();
        Singleton1 two = Singleton1.getSingleton1();

        System.out.println(one == two);


        Class<Singleton1> clazz = Singleton1.class;
        Constructor<Singleton1> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Singleton1 three =  c.newInstance();

        System.out.println(one == three);


    }

}
