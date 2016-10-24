package com.example.myapplication.NavigationView1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.myapplication.R;


public class NavigationView_about extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.navigationview_about);
    }


    public void back(View view)
    {
        Intent intent = new Intent(getApplicationContext(),NavigationView.class);
        startActivity(intent);
    }




}
