package sdww8591;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by sdww on 16-9-21.
 */
public class Server {

    public static final int PORT = 9000;

    public static final Logger log = LoggerFactory.getLogger(Server.class);

    public static void main(String[] args) {

        ServerSocket socket = null;
        try {
            socket = new ServerSocket(PORT);
        } catch (Exception e) {
            log.error("serverSocket() error:",e);
        }

        log.info("server socket is ready....");

        while (true) {
            Socket clientSocket = null;
            try {
                clientSocket = socket.accept();
            } catch (Exception e) {
                log.error("socket() error:", e);
            }

            log.info(clientSocket.getInetAddress().toString());
        }
    }
}
