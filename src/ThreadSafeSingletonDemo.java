// Singleton class that ensures only one instance exists across threads
class ThreadSafeSingleton {
    // 'volatile' ensures visibility of changes across threads
    private static volatile ThreadSafeSingleton instance;

    // Private constructor prevents instantiation from other classes
    private ThreadSafeSingleton() {}

    // Public method to provide global access to the single instance
    public static ThreadSafeSingleton getInstance() {
        // First check (no locking) - improves performance
        if (instance == null) {
            // Synchronized block to make thread-safe
            synchronized (ThreadSafeSingleton.class) {
                // Second check - ensures only one instance is created
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance; // Return the singleton instance
    }
}

// Demo class to test ThreadSafeSingleton
public class ThreadSafeSingletonDemo {
    public static void main(String[] args) {
        // Retrieve instance using getInstance()
        ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();

        // Verify that both references point to the same object
        System.out.println("Same instance? " + (obj1 == obj2));
    }
}
