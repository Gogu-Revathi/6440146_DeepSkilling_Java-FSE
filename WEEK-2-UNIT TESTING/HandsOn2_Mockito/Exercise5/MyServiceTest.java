package com.example.mockito_demo;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
// External API interface with a method returning different values
interface ExternalApi {
    String getStatus();
}
// Service that calls the API method multiple times
class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api) {
        this.api = api;
    }
    public String[] checkStatusProgression() {
        return new String[] {
            api.getStatus(),
            api.getStatus(),
            api.getStatus()
        };
    }
}
// Test class demonstrating multiple returns
public class MyServiceTest {
    @Test
    public void testMultipleReturns() {
        // 1. Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        // 2. Stub method with multiple return values
        when(mockApi.getStatus())
            .thenReturn("Loading")
            .thenReturn("Processing")
            .thenReturn("Completed");
        // 3. Use service with mock
        MyService service = new MyService(mockApi);
        String[] result = service.checkStatusProgression();
        // 4. Assert the sequence of return values
        assertArrayEquals(new String[] {
            "Loading", "Processing", "Completed"
        }, result);
    }
}
