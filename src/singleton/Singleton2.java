package singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * 使用 静态内部类 创建 单例
 */
public class Singleton2 implements Serializable {

    private static class Singleton2ClassInstance{
        private static final Singleton2 instance = new Singleton2();
    }


    private Singleton2(){
        //防止反射破坏 单例模式， 但是如果反射将 静态内部类的静态变量置空了 也就无效了，而且单例还会返回 null
        //毕竟（拿到class 就没有 “隐私”了）
        if(Singleton2ClassInstance.instance != null){
            throw new RuntimeException("单例结构被破坏！");
        }
    }

    public static Singleton2 getSingleton1(){
        return Singleton2ClassInstance.instance;
    }

    private Object readResolve(){
        return Singleton2ClassInstance.instance;
    }


    public static void main(String[] args) throws Exception {
//        Singleton2 one = Singleton2.getSingleton1();
//        Singleton2 two = Singleton2.getSingleton1();

//        System.out.println(one == two);


        Class<Singleton2> clazz = Singleton2.class;
        Constructor<Singleton2> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Singleton2 three =  c.newInstance();

        Singleton2 one = Singleton2.getSingleton1();
        System.out.println(one == three);

    }

}
