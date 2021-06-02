package designpatterns.ict.kosovo.growth;

import designpatterns.ict.kosovo.growth.singletons.EagerDefendReflection;
import designpatterns.ict.kosovo.growth.singletons.EagerInitializationSingleton;
import designpatterns.ict.kosovo.growth.singletons.EagerInitializationSingletonV2;
import designpatterns.ict.kosovo.growth.singletons.LazyInitializationSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        EagerInitializationSingleton obj = EagerInitializationSingleton.getInstance();//new EagerInitializationSingleton();

        System.out.println(obj.hashCode());
        System.out.println(EagerInitializationSingleton.getInstance().hashCode());
        System.out.println(EagerInitializationSingleton.getInstance().hashCode());

        obj.sayHello();

        EagerInitializationSingleton.getInstance().sayHello();

        LazyInitializationSingleton lazy = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazy2 = LazyInitializationSingleton.getInstance();

        System.out.println("----------------------------");
        System.out.println(lazy.hashCode());
        System.out.println(lazy2.hashCode());
        attackToEager1();
        attackEager2();
    }

    public static void attackToEager1() {
        EagerInitializationSingleton e1 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton e2 = null;
        try {
            Constructor constructor = EagerInitializationSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            e2 = (EagerInitializationSingleton) constructor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Testing attack to eager with reflection!");
            System.out.println(e1.hashCode());
            System.out.println(e2.hashCode());
        }
    }

    public static void attackEager2() {
        EagerDefendReflection ed1 = EagerDefendReflection.getInstance();
        EagerDefendReflection ed2 = null;
        try {
            Constructor constructor = EagerDefendReflection.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            ed2 = (EagerDefendReflection) constructor.newInstance();
        } catch (NoSuchMethodException |
                InstantiationException |
                IllegalAccessException |
                InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Testing Eager Defend Reflection!");
            System.out.println(ed1.hashCode());
            System.out.println(ed2 != null ? ed2.hashCode() : "it is null (not initialized)");
        }
    }


}

