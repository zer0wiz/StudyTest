package Patterns.adapterPattern;

/**
 * Created by Neo on 2016-06-28.
 */
public class AdapterServiceB {
    ServiceB sb1 = new ServiceB();

    void runService() {
        sb1.runServiceB();
    }
}
