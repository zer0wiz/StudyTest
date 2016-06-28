package SynchronizedTest;

/**
 * Created by Neo on 2016-06-28.
 */
public class BlackOrWhite1 {
    private String str;
    private final String BLACK = "black";
    private final String WHITE = "white";

    public synchronized void black(){
        str = BLACK;
        try {
          long sleep = (long) (Math.random()*100L);
          Thread.sleep(sleep);
          if(!str.equals(BLACK)) {
              System.out.println("+++++++++++++++++++++++bloken!++++++++++++++++++++");
          }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void white(){
        str = WHITE;
        try {
            long sleep = (long) (Math.random()*100L);
            Thread.sleep(sleep);
            if(!str.equals(WHITE)) {
                System.out.println("+++++++++++++++++++++++bloken!++++++++++++++++++++");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
