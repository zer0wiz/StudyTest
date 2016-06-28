
package speakerTest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Neo on 2016-06-21.
 */
public class testSpeaker {

    @Test
    public void run_SystemSpeaker_Module() {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(11);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
        assertThat(speaker1.getVolume(),is(11));

        speaker2.setVolume(22);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
        assertThat(speaker2.getVolume(),is(22));
    }



}
