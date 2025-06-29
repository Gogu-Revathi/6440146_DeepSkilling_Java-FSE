package com.example.mockito_demo;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
// Step 1: External API interface
interface ExternalApi {
    void initialize();
    String fetchData();
}
// Step 2: Service that uses ExternalApi
class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api) {
        this.api = api;
    }
    public void process() {
        api.initialize();           // should be called first
        api.fetchData();            // then this
    }
}
// Step 3: Test class verifying order
public class MyServiceTest {

    @Test
    public void testInteractionOrder() {
        // 1. Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        // 2. Call the methods in a specific order
        MyService service = new MyService(mockApi);
        service.process();
        // 3. Verify the interaction order
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).initialize();  // Must come first
        inOrder.verify(mockApi).fetchData();   // Must come after
    }
}
