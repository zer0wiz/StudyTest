package testTdd;

/**
 * Created by Neo on 2016-07-01.
 */
public class IgnoreCaseTest {
    public static void main(String[] args) {
        String test = "true";
        if(test.equalsIgnoreCase("true") == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
