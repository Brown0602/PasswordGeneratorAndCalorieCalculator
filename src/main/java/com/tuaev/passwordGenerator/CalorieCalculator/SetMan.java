package com.tuaev.passwordGenerator.CalorieCalculator;

import java.util.ArrayList;
import java.util.List;

public class SetMan {

    private int age;
    private int weight;
    private int height;

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

    public SetMan() {
    }

    public SetMan(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public static List<Integer> setMan(int age, int weight, int height){

        int maintenanceMan = MaintenanceMan.maintenanceMan(age, weight, height);
        maintenanceMan *= 1.1;
        double fixed = 6.25;
        List<Integer> resultRatio = new ArrayList();
        resultRatio.add(0, maintenanceMan);
        double[] ratio = {1.2, 1.375, 1.55, 1.725, 1.9};

        double resultDouble = (10 * weight) + (fixed * height) - (5 * age) + 5;
        int resultInt = (int)resultDouble;
        int initial = resultInt;

        for (int countOne = 0; countOne < ratio.length; countOne++){
            resultInt *= ratio[countOne];
            resultInt *= 1.1;
            resultRatio.add(resultInt);
            resultInt = initial;
        }

        return resultRatio;
    }
}
