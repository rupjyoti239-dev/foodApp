package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


    }

    public void login(View v){
        Intent intent = new Intent(MainActivity.this,SignInActivity.class);
        startActivity(intent);

    }

    public void register(View v){
        Intent intent = new Intent(MainActivity.this,SignUpActivity.class);
        startActivity(intent);
    }
}
