/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajotwitter;

import java.util.List;
import javax.swing.JOptionPane;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.Query;
import twitter4j.QueryResult;
/**
 * Clase con el metodo Twittear
 * @author Adry
 */
public class Twittear {
    private ConfigurationBuilder cb;
    private Twitter twitter = TwitterFactory.getSingleton();

    public Twittear() {
    }
    
    /**
     * Publica un twit que escribas
     * @throws TwitterException 
     */
    public void publicarTwit()throws TwitterException {
    Status tweetEscrito = Autorizar.autorizacion().updateStatus(JOptionPane.showInputDialog("Twit"));
    }
    public void verTimeLine() throws TwitterException {
        List<Status> timeLineList = Autorizar.autorizacion().getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (int i = 0; i <=500; i++) {
            String aux = timeLineList.get(i).getText();
            System.out.println("-------Twit Nº"+(i+1)+"--------");
            System.out.println(aux);
        }

    }
    public void buscarTwit() throws TwitterException {
        String mensaje=JOptionPane.showInputDialog("Mensaje a buscar");
        int cantidadTwits=Integer.parseInt(JOptionPane.showInputDialog("Numero maximo de twits que quieres ver"));
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            Query query = new Query(mensaje);
            QueryResult result;
                result = Autorizar.autorizacion().search(query);
                List<Status> twit = result.getTweets();
                for (int i = 0; i < cantidadTwits; i++) {
                    System.out.println("@"+ twit.get(i).getUser().getScreenName()+"\nTwits-> "+ twit.get(i).getText());
                }
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Error en la busqueda de twits" + te.getErrorMessage());
            System.exit(-1);
        }
    }
}
