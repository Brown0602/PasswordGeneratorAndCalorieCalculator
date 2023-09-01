package com.tuaev.passwordGenerator.Controllers;

import com.tuaev.passwordGenerator.repo.ServicePasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PasswordGeneratorController {

    @Autowired
    @Qualifier("PasswordGeneratorGET")
    private ServicePasswordGenerator serviceGET;
    @Autowired
    @Qualifier("PasswordGeneratorPOST")
    private ServicePasswordGenerator servicePOST;

    @RequestMapping(value = "/password-generator", method = RequestMethod.GET)
    public String passwordGenerator(Model model) {
        return serviceGET.PasswordGeneratorGET(model);
    }

    @RequestMapping(value = "/password-generator", method = RequestMethod.POST)
    public String resultOfPasswordGeneration(@RequestParam(defaultValue = "") String numbers, @RequestParam(defaultValue = "") String uppercase, @RequestParam(defaultValue = "") String lowercase, @RequestParam(defaultValue = "") String special_characters, @RequestParam String password_length, @RequestParam String number_passwords, Model model) {

        return servicePOST.PasswordGeneratorPOST(numbers, uppercase, lowercase, special_characters, password_length, number_passwords, model);
    }
}
