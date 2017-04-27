package trabajotwitter;

import java.util.List;
import javax.swing.JOptionPane;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author Adry
 */
public class Busqueda {

    public void buscarTwit() throws TwitterException {
        String mensaje=JOptionPane.showInputDialog("Mensaje a buscar");
        int cantidadTwits=Integer.parseInt(JOptionPane.showInputDialog("Numero maximo de twits que quieres ver"));
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            Query query = new Query(mensaje);
            QueryResult result;
            do {
                result = Autorizar.autorizacion().search(query);
                List<Status> twit = result.getTweets();
                for (int i = 0; i < cantidadTwits; i++) {
                    System.out.println("@"+ twit.get(i).getUser().getScreenName()+"\nTwits"+ twit.get(i).getText());
                }
            } while ((query = result.nextQuery()) != null);
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Error en la busqueda de twits" + te.getErrorMessage());
            System.exit(-1);
        }
    }
}
