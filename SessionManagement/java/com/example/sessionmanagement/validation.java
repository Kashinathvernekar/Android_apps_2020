package com.example.sessionmanagement;

public class validation {
    public static String validate(user user){
        if (user.getName().equals("admin") && user.getPass().equals("admin")){
            return "success";
        }else {
            return "fails";
        }
    }
}
