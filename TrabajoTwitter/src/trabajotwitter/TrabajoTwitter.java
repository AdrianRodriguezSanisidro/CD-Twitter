package trabajotwitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

/**
 * Clase principal
 * @author Adry
 */
public class TrabajoTwitter {
/**
 * Main donde seleccionamos que accion queremos hacer
 * @param args
 * @throws TwitterException 
 */
    public static void main(String[] args) throws TwitterException {
        Twittear objTwit=new Twittear();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1:Publicar twit\n2:Visualizar time line\n3:Buscar twits"));
            switch (opcion) {
                case 1:
                    objTwit.publicarTwit();
                    System.out.println("Twit publicado");
                    break;
                case 2:
                    objTwit.verTimeLine();
                    System.out.println("****Final de la time line****");
                    break;
                case 3:
                    objTwit.buscarTwit();
                    System.out.println("****Final de la busqueda****");
                    break;
            }
        } while (opcion != 0);
    }
}
