package com.example.sessionmanagement;

import android.content.Context;
import android.content.SharedPreferences;

public class user {
    Context context;
    SharedPreferences sharedPreferences;

    public user(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("login_details", Context.MODE_PRIVATE);
    }

    public String getName() {
        name = sharedPreferences.getString("name","");
        return name;

    }

    public void setName(String name) {
        this.name = name;
        sharedPreferences.edit().putString("name", name).commit();
    }

    public String getPass() {
        pass = sharedPreferences.getString("pass","");
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
        sharedPreferences.edit().putString("pass", pass).commit();
    }

    public void removeUser(){
        sharedPreferences.edit().clear().commit();
    }

    private  String name, pass;

}
