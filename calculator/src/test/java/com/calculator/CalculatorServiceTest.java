package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

	private final CalculatorService calculatorService = new CalculatorServiceImpl();
	
	@Test
    void testAdd_EmptyString_ShouldReturnZero() {
        assertEquals(0, calculatorService.add(""));
    }
	
	@Test
    void testAdd_SingleNumber_ShouldReturnNumber() {
        assertEquals(1, calculatorService.add("1"));
    }
	
	@Test
    void testAdd_TwoNumbers_ShouldReturnSum() {
        assertEquals(6, calculatorService.add("1,5"));
    }
	
	@Test
    void testAdd_MultipleNumbers_ShouldReturnSum() {
        assertEquals(10, calculatorService.add("1,2,3,4"));
    }
}
