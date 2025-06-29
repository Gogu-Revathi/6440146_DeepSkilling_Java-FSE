package com.example.mockito_demo;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

// External API interface
interface ExternalApi {
    String getDataById(String id);
}
// Service class using the API
class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api) {
        this.api = api;
    }
    public String fetchDataById(String id) {
        return api.getDataById(id);
    }
}

// Test class demonstrating argument matching
public class MyServiceTest {
    @Test
    public void testArgumentMatching() {
        // 1. Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        // 2. Stub method with any string
        when(mockApi.getDataById(anyString())).thenReturn("Mock Response");
        // 3. Call method with specific argument
        MyService service = new MyService(mockApi);
        String result = service.fetchDataById("12345");
        // 4. Assert the return value
        assertEquals("Mock Response", result);
        // 5. Verify method was called with the exact argument
        verify(mockApi).getDataById(eq("12345"));
        // OR: verify it was called with any string
        // verify(mockApi).getDataById(anyString());
    }
}
