package trabajotwitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Adry
 */
public class Autorizar {

    public static Twitter autorizacion() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("50XsjdZaSSVhh0K89T4cnhueY")
                .setOAuthConsumerSecret("DriqCDm15djcPZwJ2jL72J6mlG5qFCo8ub4VFJBKoNdoBI66MC")
                .setOAuthAccessToken("526997779-9dVpwSDGWKFI6EfEvkRr88wNePCPlVy5aAmiIMls")
                .setOAuthAccessTokenSecret("yJE9FzruR9aL0pRiXe49CcjY2dDrj5MA2ARWZDtzJxQSK");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }
}
