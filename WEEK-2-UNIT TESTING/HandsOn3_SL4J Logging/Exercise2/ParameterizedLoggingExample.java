package com.example.logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);
    public static void main(String[] args) {
        String user = "Likitha";
        int age = 22;
        String city = "Hyderabad";
        // Parameterized logging using {} placeholders
        logger.info("User {} is {} years old and lives in {}", user, age, city);
        // Another example
        int a = 10, b = 20;
        logger.debug("Adding {} and {} gives {}", a, b, (a + b));
        // Warning level with parameter
        logger.warn("User {} has not logged in for {} days", user, 5);
    }
}
