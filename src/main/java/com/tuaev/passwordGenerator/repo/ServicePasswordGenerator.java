package com.tuaev.passwordGenerator.repo;

import org.springframework.ui.Model;

public interface ServicePasswordGenerator {
    String PasswordGeneratorGET(Model model);
    String PasswordGeneratorPOST(String numbers,  String uppercase, String lowercase, String special_characters,
                                 String password_length, String number_passwords, Model model);

}
