package designpatterns.ict.kosovo.growth.singletons;

public class LazyInitializationSingletonV2 {
    private static LazyInitializationSingletonV2 instance;

    private LazyInitializationSingletonV2() {
    }

    public LazyInitializationSingletonV2 getInstance() {
        if (instance == null) {
            //bloko cdo kend qe tenton me inicialiu derisa te kryej pune
            synchronized (LazyInitializationSingletonV2.class) {
                //10 sekonda
                instance = new LazyInitializationSingletonV2();
            }
        }
        return instance;
    }

}
