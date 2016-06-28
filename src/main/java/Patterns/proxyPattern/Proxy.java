package Patterns.proxyPattern;

/**
 * Created by Neo on 2016-06-28.
 */
public class Proxy implements IService {
    IService service1;

    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과 정상");

        service1 = new Service();
        return service1.runSomething();

    }
}
