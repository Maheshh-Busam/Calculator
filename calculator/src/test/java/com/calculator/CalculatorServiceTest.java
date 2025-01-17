package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

	private final CalculatorService calculatorService = new CalculatorServiceImpl();
	
	@Test
    void testAdd_EmptyString_ShouldReturnZero() {
        assertEquals(0, calculatorService.add(""));
    }
	
	

	
}
