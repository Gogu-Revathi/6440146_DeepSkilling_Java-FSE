package com.example.mockito_demo;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
// External dependency with a void method
interface Auditor {
    void audit(String event);   // may throw
}
//   Service under test
class MyService {
    private final Auditor auditor;
    MyService(Auditor auditor) {
        this.auditor = auditor;
    }
    void performCriticalAction() {
        // delegate to void method that might fail
        auditor.audit("CRITICAL_ACTION");
    }
}
//   Test ─ stub the void method to throw and verify the call
public class MyServiceTest {
    @Test
    void auditFailurePropagates() {
        // Create mock
        Auditor mockAuditor = Mockito.mock(Auditor.class);
        //  Stub the void method to throw
        doThrow(new RuntimeException("Audit failed"))
                .when(mockAuditor).audit("CRITICAL_ACTION");
        MyService service = new MyService(mockAuditor);
        //  Assert that the exception is thrown
        RuntimeException ex = assertThrows(RuntimeException.class,
                                           service::performCriticalAction);
        assertEquals("Audit failed", ex.getMessage());
        //  Verify the interaction took place once with the expected arg
        verify(mockAuditor, times(1)).audit("CRITICAL_ACTION");
    }
}
