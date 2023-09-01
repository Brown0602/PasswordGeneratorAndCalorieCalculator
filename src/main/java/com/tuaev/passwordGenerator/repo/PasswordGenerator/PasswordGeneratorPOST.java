package com.tuaev.passwordGenerator.repo.PasswordGenerator;

import com.tuaev.passwordGenerator.GeneratedPassword.GeneratedPassword;
import com.tuaev.passwordGenerator.repo.ServicePasswordGenerator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Qualifier("PasswordGeneratorPOST")
@Service
public class PasswordGeneratorPOST implements ServicePasswordGenerator {

    @Override
    public String PasswordGeneratorGET(Model model) {
        return null;
    }

    @Override
    public String PasswordGeneratorPOST(String numbers, String uppercase, String lowercase, String special_characters, String password_length, String number_passwords, Model model) {
        String error = "";
        String checked = "checked";
        GeneratedPassword generatedPassword = new GeneratedPassword(numbers, uppercase, lowercase, special_characters, password_length, number_passwords);

        if (numbers.equals("") && uppercase.equals("") && lowercase.equals("") && special_characters.equals("")) {
            error = "Необходимо выбрать хотя бы один параметр для генерации пароля!";
            String errorType = "";
            model.addAttribute("password_length", password_length);
            model.addAttribute("number_passwords", number_passwords);
            model.addAttribute("errorType", errorType);
            model.addAttribute("error", error);
            model.addAttribute("numbers", numbers);
            model.addAttribute("uppercase", uppercase);
            model.addAttribute("lowercase", lowercase);
            model.addAttribute("special_characters", special_characters);
            return "passwordGenerator";
        }

        List<String> results = generatedPassword.generatedPassword();
        model.addAttribute("password_length", password_length);
        model.addAttribute("number_passwords", number_passwords);
        model.addAttribute("checked", checked);
        model.addAttribute("results", results);
        model.addAttribute("numbers", numbers);
        model.addAttribute("uppercase", uppercase);
        model.addAttribute("lowercase", lowercase);
        model.addAttribute("special_characters", special_characters);
        return "passwordGenerator";
    }
}
