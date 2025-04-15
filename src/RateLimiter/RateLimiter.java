package RateLimiter;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class RateLimiter {
    private final int maxTokens;           // Maximum number of tokens
    private final int refillRate;         // Tokens added per second
    private ConcurrentHashMap<String, Bucket> clientBuckets;

    public RateLimiter(int maxTokens, int refillRate) {
        this.maxTokens = maxTokens;
        this.refillRate = refillRate;
        this.clientBuckets = new ConcurrentHashMap<>();
    }

    // Check if a request is allowed for a client
    public synchronized boolean allowRequest(String clientId) {
        Bucket bucket = clientBuckets.computeIfAbsent(clientId, id -> new Bucket(maxTokens, refillRate));
        return bucket.grantAccess();
    }

    // Inner Bucket class
    private static class Bucket {
        private int tokens;
        private final int maxTokens;
        private final int refillRate;
        private long lastRefillTimestamp;

        public Bucket(int maxTokens, int refillRate) {
            this.maxTokens = maxTokens;
            this.refillRate = refillRate;
            this.tokens = maxTokens;
            this.lastRefillTimestamp = System.nanoTime();
        }

        // Refill tokens based on elapsed time
        private void refillTokens() {
            long now = System.nanoTime();
            long elapsedTime = now - lastRefillTimestamp;

            int tokensToAdd = (int) (elapsedTime / TimeUnit.SECONDS.toNanos(1)) * refillRate;
            tokens = Math.min(maxTokens, tokens + tokensToAdd);
            if (tokensToAdd > 0) {
                lastRefillTimestamp = now;
            }
        }

        // Grant access if tokens are available
        public boolean grantAccess() {
            refillTokens();
            if (tokens > 0) {
                tokens--;
                return true;
            }
            return false;
        }
    }
}