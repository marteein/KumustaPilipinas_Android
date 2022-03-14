package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private TextView prod;

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        videoView = (VideoView)findViewById(R.id.videoView);
        Uri video = Uri.parse("android.resource://"+ getPackageName() +"/"+ R.raw.intro);

        videoView.setVideoURI(video);

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if(isFinishing())
                    return;

                startActivity(new Intent(MainActivity.this, AppIntroActivity.class));
                finish();

            }
        });
        videoView.start();

    }
}
