package Patterns.templateCallBackPattern;

/**
 * Created by Neo on 2016-06-28.
 * 전략 Strategy 패턴을 임의함수(람다식)으로 리팩토링
 */
public class Client {
    public static void main(String[] args) {
        /*
         * Strategy strategy = null;
         */
        Solider rambo = new Solider();
        /*
         * // 총을 람보에게 전달해서 전투를 수행하게 해준다.
         * strategy = new StrategyGun();
         * rambo.runContext(strategy);
         */
        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총! 총초종총.총! 총!");
            }
        });
        System.out.println();

        /*
         * //검을 람보에게 전달해서 전투를 수행하게 한다.
         * strategy = new StrategySword();
         * rambo.runContext(strategy);
         */
        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("칼! 칼칼카카칼카랄!");
            }
        });

        System.out.println();

        /*
         * //활을 람보에게 전달해서 전투를 수행하게 한다.
         * strategy = new StrategyBow();
         * rambo.runContext(strategy);
         */
        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("활~~ 화화뢀화활~~!!");
            }
        });
        System.out.println();

    }
}
