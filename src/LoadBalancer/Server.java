package LoadBalancer;

// Server class representing backend servers
public class Server {
    private final String serverName;

    public Server(String serverName) {
        this.serverName = serverName;
    }

    public String getServerName() {
        return serverName;
    }

    public void handleRequest(String request) {
        System.out.println("Request \"" + request + "\" handled by " + serverName);
    }
}
