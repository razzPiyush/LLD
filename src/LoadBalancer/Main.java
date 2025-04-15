package LoadBalancer;

// Main class to simulate requests and load balancing
public class Main {
    public static void main(String[] args) {
        LoadBalancer loadBalancer = new LoadBalancer();
        Server server2 = new Server("Server2");
        // Add servers to the pool
        loadBalancer.addServer(new Server("Server1"));
        loadBalancer.addServer(server2);
        loadBalancer.addServer(new Server("Server3"));

        // Simulate incoming requests, currently assuming 10 request at a time
        for (int i = 1; i <= 10; i++) {
            loadBalancer.distributeRequest("Request" + i);
        }

        // Remove a server and test again
        System.out.println("\nRemoving Server2...\n");
        loadBalancer.removeServer(server2);

        // Simulate more requests
        for (int i = 11; i <= 15; i++) {
            loadBalancer.distributeRequest("Request" + i);
        }
    }
}