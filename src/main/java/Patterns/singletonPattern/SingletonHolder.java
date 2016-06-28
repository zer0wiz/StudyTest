package Patterns.singletonPattern;

/**
 * Created by Neo on 2016-06-28.
 */
public class SingletonHolder {
    // Private constructor prevents instantiation from other classed.
    private SingletonHolder() {}

    /**
     * SingletonHolder is loaded on the first execution of Singleton.ge
     * or the first access to SingletonHolder. INSTANCE, not before.
     * Initialization on demand holder idiom(holder에 의한 초기화 용법)
     * 늦은 초기화중 하나로 별도의 synchronized 키워드를 사용하지 않고 중첩 클래스(Holder)를 이용하는 방법
     * 모든 자바 버전에서 동작
     * 중첩 클래스(SingletonHolder)는 getInstance 메소드가 호출되기 이전에는 참조 되지 않으며, 처음 getInstance 메소드 호출시
     * SingletonHolder 클래스가 클래스 로더에 의해 로딩 되면서 싱글톤 객체 생성이 이루어집니다.(물론 static 이므로 클래스
     * 로등 시점에 한번만 호출)
     */
    private static class SingletonHolderClass {
        public static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return SingletonHolderClass.INSTANCE;
    }
}
