public class Logger {
    private static Logger instance;
    private String loggerName;

    private Logger() {
        loggerName = "AppLogger";
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[" + loggerName + "]: " + message);
    }
}
