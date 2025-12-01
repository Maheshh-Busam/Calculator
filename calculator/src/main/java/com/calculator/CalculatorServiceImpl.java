package com.calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        String[] splitNumbers = numbers.replace("\n", ",").split(",");
        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String num : splitNumbers) {
            int value = Integer.parseInt(num.trim());
            if (value < 0) {
                negativeNumbers.add(value);
            } else {
                sum += value;
            }
        }
        
     // If negative numbers exist, throw an exception
     // If negative numbers exists, throw an exception
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException(
                "Negative numbers not allowed: " + negativeNumbers.toString().replace("[", "").replace("]", "")
            );
        }

        return sum;
    }
}
