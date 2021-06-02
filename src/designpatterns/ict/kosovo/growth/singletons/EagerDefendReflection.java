package designpatterns.ict.kosovo.growth.singletons;

public class EagerDefendReflection {
    private static final EagerDefendReflection instance = new EagerDefendReflection();

    private EagerDefendReflection() {
        if (instance != null) {
            throw new IllegalStateException("Instance already is initialized!");
        }
    }

    public static EagerDefendReflection getInstance() {
        return instance;
    }


}
