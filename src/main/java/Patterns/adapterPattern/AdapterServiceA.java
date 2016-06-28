package Patterns.adapterPattern;

/**
 * Created by Neo on 2016-06-28.
 */
public class AdapterServiceA {
    ServiceA sa1 = new ServiceA();

    void runService() {
        sa1.runServiceA();
    }
}
