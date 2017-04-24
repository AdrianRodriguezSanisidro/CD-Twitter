package trabajotwitter;

import java.util.List;
import twitter4j.Status;
import twitter4j.TwitterException;

/**
 *
 * @author Adry
 */
public class TimeLine {

    public void verTimeLine() throws TwitterException {
        List<Status> timeLineList = Autorizar.autorizacion().getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (int i = 0; i <=500; i++) {
            String aux = timeLineList.get(i).getText();
            System.out.println("-------Twit Nº"+(i+1)+"--------");
            System.out.println(aux);
        }

    }
}
