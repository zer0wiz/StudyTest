package Patterns.proxyPattern;

/**
 * Created by Neo on 2016-06-28.
 * 프록시(대리자)패턴 - 어떤 다른 객체로 접근하는 것을 통제하기 위해서 그 객체의 대리자(surrogate)또는 자리채움자(Placehoder)를 제공하는 패턴
 * ex) 지연로딩, 버퍼, 캐쉬
 */
public class ClientWithProxy {
    public static void main(String[] args) {
        //프록시를 이용한 호출
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}
