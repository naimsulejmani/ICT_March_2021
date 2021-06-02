package designpatterns.ict.kosovo.growth.singletons;

public class EagerInitializationSingletonV2 {
    private static EagerInitializationSingletonV2 instance;

    private EagerInitializationSingletonV2() {
    }


    //static initializer block
    static {
        try {
            instance = new EagerInitializationSingletonV2();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public EagerInitializationSingletonV2 getInstance() {
        return instance;
    }

}

