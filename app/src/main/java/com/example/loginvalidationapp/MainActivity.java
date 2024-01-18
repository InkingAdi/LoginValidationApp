package com.example.loginvalidationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edt_username, edt_password;

    Button btn_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_username = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);

        btn_submit = findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(view -> {

            if(!edt_username.getText().toString().trim().isEmpty() && !edt_password.getText().toString().trim().isEmpty())
            {
                if(edt_username.getText().toString().trim().equals("aditya") && edt_password.getText().toString().trim().equals("aditya"))
                {
                    Intent login_intent = new Intent(getApplication(), LoginActivity.class);
                    login_intent.putExtra("IS_LOGIN","Welcome "+edt_username.getText().toString().trim()+" !");
                    startActivity(login_intent);
                }else {
                    Toast.makeText(this, "Username and Password does not match !", Toast.LENGTH_LONG).show();
                }
            }else {
                Toast.makeText(this, "Please Enter Username and Password.",Toast.LENGTH_LONG).show();
            }
        });
    }
}