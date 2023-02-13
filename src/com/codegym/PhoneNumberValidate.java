package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    private static final String PhoneNumber_Regex = "\\(([0-9]{2})\\)-\\(([0-9]{10})\\)";

    public static boolean isValidPhoneNumber(String phoneNUmber){
        Pattern pattern = Pattern.compile(PhoneNumber_Regex);
        Matcher matcher = pattern.matcher(phoneNUmber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String phoneNumber = "(84)-(0978489648)";
        System.out.println(PhoneNumberValidate.isValidPhoneNumber(phoneNumber));
        phoneNumber = "(a8)-(22222222)";
        System.out.println(PhoneNumberValidate.isValidPhoneNumber(phoneNumber));
    }
}
