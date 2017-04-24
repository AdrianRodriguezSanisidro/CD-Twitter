/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajotwitter;

import javax.swing.JOptionPane;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author Adry
 */
public class Twittear {
    public void publicarTwit()throws TwitterException {
    Status tweetEscrito = Autorizar.autorizacion().updateStatus(JOptionPane.showInputDialog("Twit"));
    }
}
