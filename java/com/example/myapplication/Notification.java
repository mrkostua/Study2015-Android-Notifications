package com.example.myapplication;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

import android.os.Bundle;
import android.view.View;

public class Notification extends Activity
{
    private NotificationManager nm;
    private final int ID_Notification = 22;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);

    }

    public void showNotofication_flag_ongoing_event (View view)
    {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
        Intent intent = new Intent(getApplicationContext(),Zodiac_leon.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        builder
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.yearofrat48)
                .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.leo48))
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setTicker("Lion astrology")
                .setContentTitle("Something interesting to read :)")
                .setContentText("These folks are impossible to miss, since they love being center stage.");

        android.app.Notification notification = builder.build();
        notification.sound = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.shot);
        notification.flags = notification.flags | android.app.Notification.FLAG_ONGOING_EVENT;


        nm.notify(ID_Notification,notification);
    }
    public void showNotofication_my_sond (View view)
    {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
        Intent intent = new Intent(getApplicationContext(),FinishNotification_activity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        builder
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.sleep)
                .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(),R.drawable.sleepinginbed48))
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setTicker("Sleep is necessary ")
                .setContentTitle("Information part1")
                .setContentText("Сон для слабаков ...народна мудрість")
                .setProgress(100 , 15 , true);

        android.app.Notification notification = builder.build();
        notification.sound = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.my_sound);

        notification.flags |=  android.app.Notification.FLAG_SHOW_LIGHTS;


        nm.notify(ID_Notification,notification);
    }
    public void showNotofication_flag_insistent (View view)
    {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
        Intent intent = new Intent(getApplicationContext(),FinishNotification_activity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        builder
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.sleepinginbed48)
                .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(), R.drawable.sleepinginbed48))
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setTicker("Sleep is necessary ")
                .setContentTitle("Information part2")
                .setContentText("Сон для слабаков ...народна мудрість");


        android.app.Notification notification = builder.build();

        notification.defaults =  android.app.Notification.DEFAULT_SOUND  ;
////        notification.sound = Uri.parse("android.resource://com.example.myapplication.app/" + R.raw.shot);
//        notification.sound = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bla);
        notification.flags = notification.flags | android.app.Notification.FLAG_INSISTENT;



        nm.notify(ID_Notification,notification);
    }
    public void showNotofication_vibration (View view)
    {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
        Intent intent = new Intent(getApplicationContext(),FinishNotification_activity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        builder
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.sleep)
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setTicker("Sleep is necessary ")
                .setContentTitle("Information part3")
                .setContentText("Сон для слабаков ...народна мудрість");


        android.app.Notification notification = builder.build();
//        notification.defaults =  android.app.Notification.DEFAULT_VIBRATE  ;
        long[] vibration = new long[] {1500, 1000 ,1500 ,500, 1500, 1000 ,1500 ,500};
        notification.vibrate = vibration;


        nm.notify(ID_Notification,notification);
    }
    public void Back_to_the_main (View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
