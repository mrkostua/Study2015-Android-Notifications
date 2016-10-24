package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Zodiac_leon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_leon);
    }
    public void Back_to_the_main (View view)
    {
        Intent intent = new Intent(this,Notification.class);
        startActivity(intent);
    }
}

