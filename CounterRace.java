import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterRace {
    public static void main(String[] args) {
        // Create an executor that starts a new virtual thread for each task
        int f =0;
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 1000; i++) {
                final int threadId = i;
                f = i;
                executor.submit(() -> myUnsynchronizedMethod(threadId));
            }
        } // The try-with-resources block automatically shuts down and waits for all threads to finish
        
        System.out.println("All"+f+ "virtual threads have finished execution.");
    }

    public static synchronized void myUnsynchronizedMethod(int id) {
        // Keeps state isolated to local stack variables so no synchronization is required
        String message = "Thread " + id + " is executing.";
        System.out.println(message);
    }
}
