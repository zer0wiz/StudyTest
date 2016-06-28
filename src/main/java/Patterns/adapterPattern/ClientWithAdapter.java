package Patterns.adapterPattern;

/**
 * Created by Neo on 2016-06-28.
 *  어댑터(변환기) 패턴 - 클래스의 인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하는 패턴으로
 *  호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들이 함께 작동하도록 함.
 */
public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();

        asa1.runService();
        asb1.runService();
    }
}
