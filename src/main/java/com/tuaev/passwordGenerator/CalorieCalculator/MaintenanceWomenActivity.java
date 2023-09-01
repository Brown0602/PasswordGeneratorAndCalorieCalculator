package com.tuaev.passwordGenerator.CalorieCalculator;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceWomenActivity {

    private int age;
    private int weight;
    private int height;

    public MaintenanceWomenActivity() {
    }

    public MaintenanceWomenActivity(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static List<Integer> maintenanceWomen(int age, int weight, int height){
        int maintenanceWomenActivity = MaintenanceWomen.maintenanceWomen(age, weight, height);
        double fixed = 6.25;
        double resultDouble = (10 * weight) + (fixed * height) - (5 * age) - 161;
        int resultInt = (int) resultDouble;
        int initial = resultInt;
        double[] ratio = {1.2, 1.375, 1.55, 1.725, 1.9};
        List<Integer> resultRatio = new ArrayList();
        resultRatio.add(0, maintenanceWomenActivity);
        for (int countOne = 0; countOne < ratio.length; countOne++){
            resultInt *= ratio[countOne];
            resultRatio.add(resultInt);
            resultInt = initial;
        }
        return resultRatio;
    }

}
