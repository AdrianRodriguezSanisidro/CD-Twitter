package trabajotwitter; 

import javax.swing.JOptionPane;
import twitter4j.TwitterException;
/**
 *
 * @author Adry
 */
public class TrabajoTwitter {

    public static void main(String[] args)throws TwitterException  {
        int opcion;
        String nombre;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1:Publicar twit"));
            switch(opcion){
            case 1:
            Twittear objTwit=new Twittear();
            objTwit.publicarTwit();
            break;
        }
    }while (opcion!=0);
}
}