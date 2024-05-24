import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetHostName {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            String hostname = localHost.getHostName();
            String ip = localHost.getHostAddress();
            System.out.println(hostname);
            System.out.println(ip);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
