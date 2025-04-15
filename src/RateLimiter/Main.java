package RateLimiter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(5, 1); // 5 tokens max, 1 token/sec

        String clientId = "client1";

        for (int i = 0; i < 20; i++) {
            if (rateLimiter.allowRequest(clientId)) {
                System.out.println("Request " + (i + 1) + ": Allowed");
            } else {
                System.out.println("Request " + (i + 1) + ": Rate limit exceeded");
            }
            Thread.sleep(200); // Simulating request intervals
        }
    }
}

/*
How It Works
Example Scenario
Setup:
Rate limiter is configured for maxRequests = 5 and timeWindow = 10 seconds.
Clients are identified by their unique IDs (e.g., "client1").

Client Request Flow:
Client1 makes the first request.
The clientRequests map is empty, so a new RequestInfo is created.
The request is allowed, and requestCount is set to 1.
Client1 makes more requests (2nd, 3rd, etc.).
Each request increments the requestCount until it reaches the maximum limit.
If Client1 exceeds 5 requests within 10 seconds:
The request is denied with "Rate limit exceeded".

After 10 seconds:
The time window resets, and Client1 can make requests again.
 */