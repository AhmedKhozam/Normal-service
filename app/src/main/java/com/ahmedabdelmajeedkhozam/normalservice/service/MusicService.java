package com.ahmedabdelmajeedkhozam.normalservice.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.view.View;

import com.ahmedabdelmajeedkhozam.normalservice.R;

public class MusicService extends Service {
    MediaPlayer mediaPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
         mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music);
        mediaPlayer.start();

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();

    }
}
