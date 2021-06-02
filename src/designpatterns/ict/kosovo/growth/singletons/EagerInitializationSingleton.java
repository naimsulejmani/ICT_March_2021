package designpatterns.ict.kosovo.growth.singletons;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton(); // - private

    private EagerInitializationSingleton() {
    } //  - private constructor

    public static EagerInitializationSingleton getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }


}
