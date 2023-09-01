package com.tuaev.passwordGenerator.GeneratedPassword;

import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

public class GeneratedPassword {
    private String numbers;
    private String uppercase;
    private String lowercase;
    private String special_characters;
    private String password_length;
    private String number_passwords;

    public GeneratedPassword(String numbers, String uppercase, String lowercase, String special_characters, String password_length, String number_passwords) {
        this.numbers = numbers;
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.special_characters = special_characters;
        this.password_length = password_length;
        this.number_passwords = number_passwords;
    }

    public GeneratedPassword() {
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getUppercase() {
        return uppercase;
    }

    public void setUppercase(String uppercase) {
        this.uppercase = uppercase;
    }

    public String getLowercase() {
        return lowercase;
    }

    public void setLowercase(String lowercase) {
        this.lowercase = lowercase;
    }

    public String getSpecial_characters() {
        return special_characters;
    }

    public void setSpecial_characters(String special_characters) {
        this.special_characters = special_characters;
    }

    public String getPassword_length() {
        return password_length;
    }

    public void setPassword_length(String password_length) {
        this.password_length = password_length;
    }

    public String getNumber_passwords() {
        return number_passwords;
    }

    public void setNumber_passwords(String number_passwords) {
        this.number_passwords = number_passwords;
    }

    //Метод по заполнению пароля
    public List<String> generatedPassword() {
        //Подсчет выбранных пунктов
        int counting = 0;
        String checked = "";
        String[] strings = {getNumbers(), getUppercase(), getLowercase(), getSpecial_characters()};
        for (int count = 0; count < strings.length; count++) {
            counting++;
            if (strings[count].equals("")) {
                counting--;
            }
        }
        //Наполнение пароля
        List<String> list = new ArrayList<>();
        String result = "";
        int countingNew = counting + 1;
        Integer IntegerGetNumberPassword = Integer.valueOf(getNumber_passwords());
        Integer IntegerGetPasswordLength = Integer.valueOf(getPassword_length());
        StringBuilder generatedPassword = new StringBuilder();
        //Цикл по наполнению пароля символами
        for (int z = 0; z < IntegerGetNumberPassword; z++) {
            for (int count5 = 0; count5 < IntegerGetPasswordLength; count5++) {
                int indexRandom = (int) (Math.random() * strings.length);
                while (strings[indexRandom].equals("")) {
                    indexRandom = (int) (Math.random() * strings.length);
                }
                if (strings[indexRandom].equals("numbers")) {
                    int[] numbersArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                    int generationNumber = (int) (Math.random() * numbersArray.length);
                    for (int i1 = 0; i1 < numbersArray.length; i1++) {
                        if (generationNumber == numbersArray[i1]) {
                            generatedPassword.append(numbersArray[i1]);
                            result = String.valueOf(generatedPassword);
                            break;
                        }
                    }
                }
                if (strings[indexRandom].equals("uppercase")) {
                    char[] charsUpper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
                    int generationCharUpper = (int) (Math.random() * charsUpper.length);
                    for (int i = 0; i < charsUpper.length; i++) {
                        if (generationCharUpper == i) {
                            generatedPassword.append(charsUpper[i]);
                            result = String.valueOf(generatedPassword);
                            break;
                        }
                    }
                }
                if (strings[indexRandom].equals("lowercase")) {
                    char[] charsLower = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
                    int generationCharUpper = (int) (Math.random() * charsLower.length);
                    for (int i = 0; i < charsLower.length; i++) {
                        if (generationCharUpper == i) {
                            generatedPassword.append(charsLower[i]);
                            result = String.valueOf(generatedPassword);
                            break;
                        }
                    }
                }
                if (strings[indexRandom].equals("special_characters")) {
                    char[] charsSpecial = {'%', '*', ')', '?', '@', '#', '$', '~'};
                    int generationCharUpper = (int) (Math.random() * charsSpecial.length);
                    for (int i = 0; i < charsSpecial.length; i++) {
                        if (generationCharUpper == i) {
                            generatedPassword.append(charsSpecial[i]);
                            result = String.valueOf(generatedPassword);
                            break;
                        }
                    }
                }
            }
            list.add(result);
            generatedPassword.delete(0, generatedPassword.length());
        }
        return list;
    }
}
