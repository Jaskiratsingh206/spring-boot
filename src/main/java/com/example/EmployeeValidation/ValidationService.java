package com.example.EmployeeValidation;


import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidationService {


    public boolean emailValidation(String email){
        //jaskiratsingh206@gmail.com
        Pattern pattern = Pattern.compile("(^[a-zA-Z0-9\\.\\+\\-\\_]*@{1}[a-zA-Z0-9]+\\.+[a-zA-Z0-9]+$)");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean phoneValidation(String phone){
        //+91 7845123654
        Pattern pattern = Pattern.compile("(^[\\+{9,1}{1}]*\\s*[0-9]{10}$)");
        Matcher matcher = pattern.matcher(phone);
        if(matcher.matches()){
            return true;
        }
        else{
            return false;
        }
    }
}

