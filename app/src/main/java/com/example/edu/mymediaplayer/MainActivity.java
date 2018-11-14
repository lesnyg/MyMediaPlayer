package com.example.edu.mymediaplayer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mediaPlayer;
    Button play,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button)findViewById(R.id.buttonPlay);
        play.setOnClickListener(this);
        stop = (Button)findViewById(R.id.buttonStop);
        stop.setOnClickListener(this);
        mediaPlayer = MediaPlayer.create(this,R.raw.bts_idol);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonPlay:
                mediaPlayer.start();
                stop.setEnabled(true);
                play.setEnabled(false);
                break;
            case R.id.buttonStop:
                mediaPlayer.pause();
                stop.setEnabled(false);
                play.setEnabled(true);
                break;

        }
    }
}
