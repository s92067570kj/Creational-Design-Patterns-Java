import java.time.LocalDateTime;

// Logger class using Singleton Pattern
class Logger {
    private static Logger instance; // Step 1: private static instance

    private Logger() {} // Step 2: private constructor

    // Step 3: global access point
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }
}

// Main class
public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("Still using the same logger instance.");

        // Check if both instances are the same
        System.out.println("Are both logger instances same? " + (logger1 == logger2));
    }
}
