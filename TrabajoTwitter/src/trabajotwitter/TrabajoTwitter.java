package trabajotwitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

/**
 *
 * @author Adry
 */
public class TrabajoTwitter {

    public static void main(String[] args) throws TwitterException {
        int opcion;
        String nombre;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1:Publicar twit\n2:Visualizar time line"));
            switch (opcion) {
                case 1:
                    Twittear objTwit = new Twittear();
                    objTwit.publicarTwit();
                    System.out.println("Twit publicado");
                    break;
                case 2:
                    TimeLine objTime = new TimeLine();
                    objTime.verTimeLine();
                    System.out.println("****Final de la time line****");
            }
        } while (opcion != 0);
    }
}
