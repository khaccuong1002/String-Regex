package com.codegym;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String ClassName_Regex = "^[CAP][0-9]{4}[GHIKLM]$";
    public static void main(String[] args) {
        System.out.println("Nhập tên lớp: ");
        String className = new String(new Scanner(System.in).nextLine());
        Pattern pattern = Pattern.compile(ClassName_Regex);
        Matcher matcher = pattern.matcher(className);
        System.out.println(matcher.matches());
    }
}