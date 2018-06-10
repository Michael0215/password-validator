package com.example.michael.assignment2;

import java.util.regex.Pattern;

public class validator {
    public boolean PWformat(String password){
        if(password == null || password.isEmpty())
            return false;
        if(password.toLowerCase() == "password")
            return false;
        if(password.length()>=8)
            return true;
        Pattern onlyLowerCase = Pattern.compile("[a-z[^A-Z]]");
        Pattern specialCharacter = Pattern.compile("[^!@#$%^&*\\t\\n]");
        Pattern figure = Pattern.compile("[0-9]");
        Pattern onlyUpperCase = Pattern.compile("[A-Z[^a-z]]");
        if(onlyLowerCase.matcher(password).find())
            return true;
        if(specialCharacter.matcher(password).find())
            return true;
        if(figure.matcher(password).find())
            return false;
        if(onlyLowerCase.matcher(password).find())
            return true;
        else
            return false;
    }
}
