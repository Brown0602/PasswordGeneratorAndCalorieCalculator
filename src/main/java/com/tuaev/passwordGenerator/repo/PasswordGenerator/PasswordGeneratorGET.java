package com.tuaev.passwordGenerator.repo.PasswordGenerator;

import com.tuaev.passwordGenerator.repo.ServicePasswordGenerator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Qualifier("PasswordGeneratorGET")
@Service
public class PasswordGeneratorGET implements ServicePasswordGenerator {


    @Override
    public String PasswordGeneratorGET(Model model) {
        String password_length = "";
        String number_passwords = "";
        String checked = "";
        String errorType = "";
        String error = "";
        String numbers = "";
        String uppercase = "";
        String lowercase = "";
        String special_characters = "";
        model.addAttribute("password_length", password_length);
        model.addAttribute("number_passwords", number_passwords);
        model.addAttribute("checked", checked);
        model.addAttribute("errorType", errorType);
        model.addAttribute("error", error);
        model.addAttribute("numbers", numbers);
        model.addAttribute("uppercase", uppercase);
        model.addAttribute("lowercase", lowercase);
        model.addAttribute("special_characters", special_characters);
        return "passwordGenerator";
    }

    @Override
    public String PasswordGeneratorPOST(String numbers, String uppercase, String lowercase, String special_characters, String password_length, String number_passwords, Model model) {
        return null;
    }
}
