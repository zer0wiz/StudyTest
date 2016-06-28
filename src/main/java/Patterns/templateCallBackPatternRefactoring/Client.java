package Patterns.templateCallBackPatternRefactoring;

/**
 * Created by Neo on 2016-06-28.
 * 전략 Strategy 패턴을 임의함수(람다식)으로 리팩토링
 */
public class Client {
    public static void main(String[] args) {
        Solider rambo = new Solider();

        rambo.runContext("총! 총총총초오오오총~!!::리팩토링");

        System.out.println();

        rambo.runContext("칼! 칼칼카랔라칼카라~!!::리팩토링");

        System.out.println();

        rambo.runContext("활! 화화활뢍라호홝활~!!::리팩토링");

        System.out.println();

    }
}
