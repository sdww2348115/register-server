package sdww8591;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Socket;

/**
 * Created by sdww on 16-9-21.
 */
public class Client {

    private static final Logger log = LoggerFactory.getLogger(Client.class);

    private static final String serverAddr = "www.sdww8591.com";

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", Server.PORT);
            log.info("connect success!");
        } catch (Exception e) {
            log.error("connect error!", e);
        }
    }
}
