package trabajotwitter;

import java.util.List;
import twitter4j.Status;
import twitter4j.TwitterException;

/**
 * Clase con el metodo TimeLine
 * @author Adry
 */
public class TimeLine {
/*
 * Muestra los 20 primeros twits
 * @throws TwitterException 
 */
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
