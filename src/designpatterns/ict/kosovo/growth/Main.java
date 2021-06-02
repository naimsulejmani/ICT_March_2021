package designpatterns.ict.kosovo.growth;

import designpatterns.ict.kosovo.growth.singletons.EagerInitializationSingleton;
import designpatterns.ict.kosovo.growth.singletons.LazyInitializationSingleton;

public class Main {
    public static void main(String[] args) {
        EagerInitializationSingleton obj = EagerInitializationSingleton.getInstance();//new EagerInitializationSingleton();

        System.out.println(obj);
        System.out.println(EagerInitializationSingleton.getInstance());
        System.out.println(EagerInitializationSingleton.getInstance());

        obj.sayHello();

        EagerInitializationSingleton.getInstance().sayHello();

        LazyInitializationSingleton lazy = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazy2 = LazyInitializationSingleton.getInstance();

        System.out.println("----------------------------");
        System.out.println(lazy);
        System.out.println(lazy2);
    }
}

