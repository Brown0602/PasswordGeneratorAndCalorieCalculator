package com.tuaev.passwordGenerator.NewGeneratedPassword;

import java.util.ArrayList;
import java.util.List;

public class NewGeneratedPassword {
    String chars;
    String passwordLength;

    public NewGeneratedPassword(String chars, String passwordLength){
        this.chars = chars;
        this.passwordLength = passwordLength;
    }

    public List<String> resultOfPasswordGeneration(String chars, String passwordLength){
        List <String> results = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int count2 = 0; count2 < 10; count2++) {
            int intPasswordLength = Integer.parseInt(passwordLength);
            while (stringBuilder.length() < intPasswordLength) {
                int indexRandom = (int) (Math.random() * chars.length());
                for (int count1 = 0; count1 < chars.length(); count1++) {
                    if (count1 == indexRandom) {
                        stringBuilder.append(chars.charAt(count1));
                        break;
                    }
                }
            }
            String res = String.valueOf(stringBuilder);
            results.add(res);
            stringBuilder.delete(0, stringBuilder.length());
        }
        return results;
    }

}
