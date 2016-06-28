package Patterns.strategyPattern;

/**
 * Created by Neo on 2016-06-28.
 */
public class Solider {
    public void runContext(Strategy strategy) {
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }
}
