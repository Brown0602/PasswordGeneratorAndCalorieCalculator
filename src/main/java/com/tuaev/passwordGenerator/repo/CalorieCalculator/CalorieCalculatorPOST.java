package com.tuaev.passwordGenerator.repo.CalorieCalculator;

import com.tuaev.passwordGenerator.CalorieCalculator.*;
import com.tuaev.passwordGenerator.repo.ServiceCalorieCalculator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Qualifier("CalorieCalculatorPOST")
@Repository
public class CalorieCalculatorPOST implements ServiceCalorieCalculator {

    @Override
    public String CalorieCalculatorGET(Model model) {
        return null;
    }

    @Override
    public String CalorieCalculatorPOST(int age, int weight, int height, String floor, Model model) {
        String sex = floor;

        if (sex.equals("man")) {
            model.addAttribute("sex", sex);
            List<String> ratio = new ArrayList<>();
            ratio = Activity.getRatio();
            model.addAttribute("ratio", ratio);
            List<Integer> maintenanceManActivity = MaintenanceManActivity.maintenanceManActivity(age, weight, height);
            model.addAttribute("maintenanceManActivity", maintenanceManActivity);
            List<Integer> setManActivity = SetMan.setMan(age, weight, height);
            model.addAttribute("setManActivity", setManActivity);
            List<Integer> dialManActivity = DialMan.dialMan(age, weight, height);
            model.addAttribute("dialManActivity", dialManActivity);
            model.addAttribute("age", age);
            model.addAttribute("weight", weight);
            model.addAttribute("height", height);
            model.addAttribute("floor", floor);
        } else if (sex.equals("women")) {
            List<String> ratio = Activity.getRatio();
            model.addAttribute("ratio", ratio);
            List<Integer> maintenanceWomenActivity = MaintenanceWomenActivity.maintenanceWomen(age, weight, height);
            model.addAttribute("maintenanceWomenActivity", maintenanceWomenActivity);
            List<Integer> setWomenActivity = SetWomen.setWomen(age, weight, height);
            model.addAttribute("setWomen", setWomenActivity);
            List<Integer> dialWomenActivity = DialWomen.dialWomen(age, weight, height);
            model.addAttribute("dialWomen", dialWomenActivity);
            model.addAttribute("age", age);
            model.addAttribute("weight", weight);
            model.addAttribute("height", height);
            model.addAttribute("floor", floor);
            model.addAttribute("sex", sex);

        }
        return "calorieCalculator";
    }
}
