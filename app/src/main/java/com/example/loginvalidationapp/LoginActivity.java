package com.example.loginvalidationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Intent intent;
    TextView txt_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_display = findViewById(R.id.txt_display);
        intent = getIntent();
        if(!intent.getStringExtra("IS_LOGIN").isEmpty()) {
            txt_display.setText(intent.getStringExtra("IS_LOGIN"));
        }

    }
}