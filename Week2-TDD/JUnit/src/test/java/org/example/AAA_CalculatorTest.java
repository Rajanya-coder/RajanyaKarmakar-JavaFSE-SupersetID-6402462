package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
public class AAA_CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: runs BEFORE every test
        calculator = new Calculator();
        System.out.println("Setup done.");
    }

    @After
    public void tearDown() {
        // Teardown: runs AFTER every test
        calculator = null;
        System.out.println("Teardown done.");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(2, 3);
        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        // Act
        int result = calculator.multiply(2, 4);
        // Assert
        assertEquals(8, result);
    }
}
