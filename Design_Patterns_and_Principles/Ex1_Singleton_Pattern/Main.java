public class Main {
    public static void main(String[] args) {
        System.out.println("=== Singleton Logger Demo ===");

        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        System.out.println("Logger instances same? " + (logger1 == logger2));
    }
}
