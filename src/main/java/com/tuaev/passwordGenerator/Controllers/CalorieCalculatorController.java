package com.tuaev.passwordGenerator.Controllers;

import com.tuaev.passwordGenerator.repo.ServiceCalorieCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalorieCalculatorController {

    @Autowired
    @Qualifier("CalorieCalculatorGET")
    private ServiceCalorieCalculator serviceGET;
    @Autowired
    @Qualifier("CalorieCalculatorPOST")
    private ServiceCalorieCalculator servicePOST;

    @RequestMapping(value = "/calorie-calculator", method = RequestMethod.GET)
    public String calorieCalculator(Model model) {
        return serviceGET.CalorieCalculatorGET(model);
    }

    @RequestMapping(value = "calorie-calculator", method = RequestMethod.POST)
    public String calorieCalculator(@RequestParam int age, @RequestParam int weight, @RequestParam int height,
                                    @RequestParam String floor, Model model) {

        return servicePOST.CalorieCalculatorPOST(age, weight, height, floor, model);
    }
}


