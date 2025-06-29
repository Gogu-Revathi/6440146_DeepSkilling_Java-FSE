package com.example.logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MultiAppenderLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(MultiAppenderLoggingExample.class);
    public static void main(String[] args) {
        logger.info("Info log - visible in console and app.log");
        logger.warn("Warning log - visible in console and app.log");
        logger.debug("Debug log - visible in console and app.log");
        logger.error("Error log - visible in console and app.log");
    }
}
