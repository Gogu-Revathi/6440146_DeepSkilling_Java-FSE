package com.example.mockito_demo;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
// Step 1: Define an interface with a void method
interface Logger {
    void log(String message);
}
// Step 2: A service class that uses the Logger
class MyService {
    private Logger logger;
    public MyService(Logger logger) {
        this.logger = logger;
    }
    public void process() {
        // do some work...
        logger.log("Processing done");
    }
}
// Step 3: Test the void method interaction
public class MyServiceTest {
    @Test
    public void testVoidMethod() {
        // 1. Create mock object
        Logger mockLogger = Mockito.mock(Logger.class);
        // 2. Optionally stub the void method (not required unless exception needed)
        doNothing().when(mockLogger).log(anyString());
        // 3. Create service with the mock
        MyService service = new MyService(mockLogger);
        service.process();
        // 4. Verify the void method was called with specific argument
        verify(mockLogger).log("Processing done");
    }
}
