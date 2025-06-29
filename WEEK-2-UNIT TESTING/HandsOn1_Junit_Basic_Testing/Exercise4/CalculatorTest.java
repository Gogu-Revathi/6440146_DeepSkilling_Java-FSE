package com.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    private Calculator calc;
    // Setup method: runs before each test
    @Before
    public void setUp() {
        calc = new Calculator();  // Arrange
        System.out.println("Setting up test...");
    }
    // Teardown method: runs after each test
    @After
    public void tearDown() {
        calc = null;  // Cleanup
        System.out.println("Cleaning up test...\n");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calc.add(5, 7);
        // Assert
        assertEquals(12, result);
    }
    @Test
    public void testSubtract() {
        // Act
        int result = calc.subtract(10, 4);
        // Assert
        assertEquals(6, result);
    }
}
