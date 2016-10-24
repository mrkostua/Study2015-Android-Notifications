package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);

    }
    public void menuAboutAutor(MenuItem item)
    {
        //Toast.makeText(this,"I am a developer in Android and I like to travel",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(),About_Autor.class);
        startActivity(intent);
    }
    public void menuPurposes(MenuItem item)
    {
        Intent intent = new Intent(getApplicationContext(),Purposes.class);
        startActivity(intent);
    }
    public void menuNewNotification(MenuItem item)
    {
        Intent intent = new Intent(getApplicationContext(),Notification.class );
        startActivity(intent);
    }

    public void menuSettings(MenuItem item)
    {
        Intent intent = new Intent (getApplicationContext(),Settings.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }





}
