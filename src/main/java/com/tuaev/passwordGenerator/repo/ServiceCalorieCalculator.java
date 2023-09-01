package com.tuaev.passwordGenerator.repo;

import org.springframework.ui.Model;

public interface ServiceCalorieCalculator {
    String CalorieCalculatorGET(Model model);
    String CalorieCalculatorPOST(int age, int weight, int height, String floor, Model model);
}
