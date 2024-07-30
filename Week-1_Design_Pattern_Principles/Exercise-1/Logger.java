public class Logger {
    // Private static instance of the same class that is the only instance of the class
    private static Logger instance;

    // Private constructor to restrict instantiation of the class from other classes
    private Logger() {
        // Initialize the Logger, maybe setup file handler, etc.
    }

    // Public static method that returns the instance of the class, lazy initialization
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Sample method to demonstrate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
