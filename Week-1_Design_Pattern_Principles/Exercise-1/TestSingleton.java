public class TestSingleton {
    public static void main(String[] args) {
        // Get the only object available
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages to demonstrate singleton behavior
        logger1.log("First message");
        logger2.log("Second message");

        // Verify that logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}

