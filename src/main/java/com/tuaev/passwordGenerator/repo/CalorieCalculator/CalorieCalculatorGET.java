package com.tuaev.passwordGenerator.repo.CalorieCalculator;


import com.tuaev.passwordGenerator.repo.ServiceCalorieCalculator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Qualifier("CalorieCalculatorGET")
@Repository
public class CalorieCalculatorGET implements ServiceCalorieCalculator {

    @Override
    public String CalorieCalculatorGET(Model model) {
        String sex = "";
        String age = "";
        String weight = "";
        String height = "";
        String floor = "";
        model.addAttribute("age", age);
        model.addAttribute("weight", weight);
        model.addAttribute("height", height);
        model.addAttribute("floor", floor);
        model.addAttribute("sex", sex);

        return "calorieCalculator";
    }

    @Override
    public String CalorieCalculatorPOST(int age, int weight, int height, String floor, Model model) {
        return null;
    }
}
