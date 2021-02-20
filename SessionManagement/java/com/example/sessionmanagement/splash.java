package com.example.sessionmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (new user(splash.this).getName() != "") {
                    Intent intent1 = new Intent(splash.this, welcome.class);
                    startActivities(new Intent[]{intent1});
                    finish();
                }else {

                    Intent intent2 = new Intent(splash.this, MainActivity.class);
                    startActivities(new Intent[]{intent2});
                    finish();
                }
            }
        }, 4000);
    }
}