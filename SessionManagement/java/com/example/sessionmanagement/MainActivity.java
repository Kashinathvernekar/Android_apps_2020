package com.example.sessionmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1 = (EditText) findViewById(R.id.nameTxtview);
        t2 = (EditText) findViewById(R.id.passEdittxt);

    }

    public void login(View view) {
        String name = t1.getText().toString();
        String pass = t2.getText().toString();

        if (name.equals("") || pass.equals("")){
            Toast.makeText(this,"plz fill al the field", Toast.LENGTH_SHORT).show();
        }else {
            user usr  = new user(MainActivity.this);
            usr.setName(name);
            usr.setPass(pass);
            String msg = validation.validate(usr);
            if (msg.equals("success")){
                startActivity(new Intent(MainActivity.this, welcome.class));
                finish();
            }else {
                Toast.makeText(this,"Invalid username and pasword", Toast.LENGTH_SHORT).show();
            }
        }
    }
}