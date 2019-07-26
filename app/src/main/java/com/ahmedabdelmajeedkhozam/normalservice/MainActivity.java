package com.ahmedabdelmajeedkhozam.normalservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ahmedabdelmajeedkhozam.normalservice.service.MusicService;

public class MainActivity extends AppCompatActivity {
Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=new Intent(MainActivity.this, MusicService.class);
    }

    public void startmusicService(View view) {
        startService(i);

    }

    public void stoptmusicService(View view) {
        stopService(i);
    }
}
