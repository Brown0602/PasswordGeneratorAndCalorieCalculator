package com.tuaev.passwordGenerator.CalorieCalculator;

public class MaintenanceMan {

    private int age;
    private int weight;
    private int height;

    public MaintenanceMan() {
    }

    public MaintenanceMan(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public static int maintenanceMan(int age, int weight, int height){
        double fixed = 6.25;
        double resultDouble = (10 * weight) + (fixed * height) - (5 * age) + 5;
        int resultInt = (int) resultDouble;
        return resultInt;
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

}
