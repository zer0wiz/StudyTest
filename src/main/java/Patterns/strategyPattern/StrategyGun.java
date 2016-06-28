package Patterns.strategyPattern;

/**
 * Created by Neo on 2016-06-28.
 */
public class StrategyGun implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("탕, 타당, 타다당");
    }
}
