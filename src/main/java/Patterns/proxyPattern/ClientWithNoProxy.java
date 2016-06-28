package Patterns.proxyPattern;

/**
 * Created by Neo on 2016-06-28.
 */
public class ClientWithNoProxy {
    public static void main(String[] args) {
        //프록시를 이용하지 않은 호출
        Service service = new Service();
        System.out.println(service.runSomething());
    }
}
