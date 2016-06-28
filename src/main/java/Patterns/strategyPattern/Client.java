package Patterns.strategyPattern;

/**
 * Created by Neo on 2016-06-28.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Solider rambo = new Solider();

        // 총을 람보에게 전달해서 전투를 수행하게 해준다.
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        //검을 람보에게 전달해서 전투를 수행하게 한다.
        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();

        //활을 람보에게 전달해서 전투를 수행하게 한다.
        strategy = new StrategyBow();
        rambo.runContext(strategy);

        System.out.println();

    }
}
