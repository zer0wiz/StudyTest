package speakerTest;

/**
 * Created by Neo on 2016-06-21.
 */
public class SystemSpeaker {

    static private SystemSpeaker instance;
    private int volume;

    private SystemSpeaker() {
    }

    public static SystemSpeaker getInstance() {
        if(instance == null) {
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
