package com.example.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class About_Autor extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_autor_layout);
    }
    public void Back_main_activity (View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

