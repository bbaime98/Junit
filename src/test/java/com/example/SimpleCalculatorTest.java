package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleCalculatorTest {
    @Test
    public void shouldAddTwoNumbers() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.add(2, 5) == 7);
    }
}
