package designpatterns.ict.kosovo.growth.singletons;

public class OnDemandSingleton {
    private OnDemandSingleton() {
    }

    private static class SingletonHolder {
        static OnDemandSingleton instance = new OnDemandSingleton();
    }

    public OnDemandSingleton getInstance() {
        return SingletonHolder.instance;
    }

}
