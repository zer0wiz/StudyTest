package Patterns.singletonPattern;

/**
 * Created by Neo on 2016-06-28.
 * 메소드 전체에 synchnorized를 걸어주기 떄문에 성능상 이슈가 있음.
 * 사용시점까지 싱글톤 객체 생성을 미루기 때문에 사용하기 전까지 자원(메모리)를 점유하지 않는다는 장점.
 */
public class SingletonSyncronized {
    private static volatile SingletonSyncronized instance = null;

    private SingletonSyncronized() {}

    public static SingletonSyncronized getInstance() {
        if(instance == null) {
            synchronized (SingletonSyncronized.class){
                if(instance == null)
                    instance = new SingletonSyncronized();
            }
        }
        return instance;
    }
}
