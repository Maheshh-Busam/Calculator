package com.calculator;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        String[] splitNumbers = numbers.split(",");
        int sum = 0;
        for (String num : splitNumbers) {
            sum += Integer.parseInt(num.trim());
        }
        return sum;
    }
}
