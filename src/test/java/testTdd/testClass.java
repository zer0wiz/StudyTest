package testTdd;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Neo on 2016-06-21.
 */
public class testClass {

    private TestModule testModule;

    @Before
    public void setUp() throws Exception {
        testModule = new TestModule();
    }

    @Test
    public void catTest_return_0_create() {
        assertThat(testModule.averageRating(), is(0));
    }

    @Test
    public void catTest_return_1_when_1_was_rated() {
        testModule.rate(1);
        assertThat(testModule.averageRating(), is(1));
    }

    @Test
    public void catTest_return_4_when_3_and_5_was_rated() {
        testModule.rate(3);
        testModule.rate(5);
        assertThat(testModule.averageRating(), is(4));
    }

}
