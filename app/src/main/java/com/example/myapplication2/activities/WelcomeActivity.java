package com.example.myapplication2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication2.MainActivity;
import com.example.myapplication2.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    public void mainActivity(View view){
        startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
    }


}