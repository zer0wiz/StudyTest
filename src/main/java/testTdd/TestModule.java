package testTdd;

/**
 * Created by Neo on 2016-06-21.
 */
public class TestModule {
    private int sumOfRate = 0;
    private int countOfRate = 0;

    public Integer averageRating() {
        return countOfRate == 0 ? 0 : sumOfRate / countOfRate;
    }

    public void rate(int rate) {
        this.sumOfRate += rate;
        countOfRate++;
    }


}
