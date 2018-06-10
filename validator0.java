package com.example.michael.assignment2;

public class validator0 {
    public boolean PWformat(String password){
        if(password == null || password.isEmpty())
            return false;
        if(password.toLowerCase() == "password")
            return false;
        if(password.length()>=8)
            return true;
        else
            return false;   
    }
} 