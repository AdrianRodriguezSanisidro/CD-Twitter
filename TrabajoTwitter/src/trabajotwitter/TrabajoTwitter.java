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
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1:Publicar twit\n2:Visualizar time line\n3:Buscar twits"));
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
                    break;
                case 3:
                    Busqueda objBus= new Busqueda();
                    objBus.buscarTwit();
                    System.out.println("****Final de la busqueda****");
                    break;
            }
        } while (opcion != 0);
    }
}
