package LoadBalancer;

import java.util.ArrayList;
import java.util.List;

// Load Balancer implementing Round Robin
public class LoadBalancer {
    private List<Server> servers; // Pool of servers
    private int currentIndex;     // Tracks the current server in the pool

    public LoadBalancer() {
        this.servers = new ArrayList<>();
        this.currentIndex = -1; // Start before the first server
    }

    // Add a server to the pool
    public void addServer(Server server) {
        servers.add(server);
    }

    // Remove a server from the pool
    public void removeServer(Server server) {
        servers.remove(server);
    }

    // Distribute requests using Round Robin
    public void distributeRequest(String request) {
        if (servers.isEmpty()) {
            System.out.println("No servers available to handle the request: " + request);
            return;
        }

        // Increment index and wrap around if needed
        currentIndex = (currentIndex + 1) % servers.size();
        Server selectedServer = servers.get(currentIndex);

        // Forward request to the selected server
        selectedServer.handleRequest(request);
    }
}