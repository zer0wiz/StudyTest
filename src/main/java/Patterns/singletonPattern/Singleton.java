package Patterns.singletonPattern;

/**
 * Created by Neo on 2016-06-28.
 */
public class Singleton {
    static private Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
