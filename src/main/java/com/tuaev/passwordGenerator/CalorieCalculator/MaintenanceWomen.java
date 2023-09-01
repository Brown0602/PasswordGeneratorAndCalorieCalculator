package com.tuaev.passwordGenerator.CalorieCalculator;

public class MaintenanceWomen {

    private int age;
    private int weight;
    private int height;

    public static int maintenanceWomen(int age, int weight, int height){
        double fixed = 6.25;
        double resultDouble = (10 * weight) + (fixed * height) - (5 * age) - 161;
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

    public MaintenanceWomen(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public MaintenanceWomen() {
    }

}
