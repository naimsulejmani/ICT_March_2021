package designpatterns.ict.kosovo.growth.singletons;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
    }

    public static LazyInitializationSingleton getInstance() {
        System.out.println(instance);
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

}
