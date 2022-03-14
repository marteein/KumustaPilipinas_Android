package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Travel extends AppCompatActivity {
    ImageButton play1, play2, play3, play4, play5, play6, play7, play8, play9, play10;
    ImageButton pause1, pause2, pause3, pause4, pause5, pause6, pause7, pause8, pause9, pause10;
    private Button m_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        m_quiz = findViewById(R.id.m_quiz);
        //1-->
        final MediaPlayer magandang_umaga = MediaPlayer.create(this, R.raw.magandang_umaga);
        play1 = findViewById(R.id.imageButton);
        pause1 = findViewById(R.id.imageButton2);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magandang_umaga.start();
            }
        });
        pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magandang_umaga.pause();
            }
        });

        //2-->
        final MediaPlayer magandang_hapon = MediaPlayer.create(this, R.raw.magandang_hapon);
        play2 = findViewById(R.id.imageButton3);
        pause2 = findViewById(R.id.imageButton4);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magandang_hapon.start();
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magandang_hapon.pause();
            }
        });

        //3-->
        final MediaPlayer magandang_gabi = MediaPlayer.create(this, R.raw.magandang_gabi);
        play3 = findViewById(R.id.imageButton5);
        pause3 = findViewById(R.id.imageButton6);
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magandang_gabi.start();
            }
        });
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magandang_gabi.pause();
            }
        });

        //4-->
        final MediaPlayer kumusta = MediaPlayer.create(this, R.raw.kumusta);
        play4 = findViewById(R.id.imageButton7);
        pause4 = findViewById(R.id.imageButton8);
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kumusta.start();
            }
        });
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kumusta.pause();
            }
        });

        //5-->
        final MediaPlayer mabuti = MediaPlayer.create(this, R.raw.mabuti);
        play5 = findViewById(R.id.imageButton9);
        pause5 = findViewById(R.id.imageButton10);
        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mabuti.start();
            }
        });
        pause5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mabuti.pause();
            }
        });

        //6-->
        final MediaPlayer salamat = MediaPlayer.create(this, R.raw.salamat);
        play6 = findViewById(R.id.imageButton11);
        pause6 = findViewById(R.id.imageButton12);
        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salamat.start();
            }
        });
        pause6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salamat.pause();
            }
        });

        //7-->
        final MediaPlayer walang_anuman = MediaPlayer.create(this, R.raw.walang_anuman);
        play7 = findViewById(R.id.imageButton13);
        pause7 = findViewById(R.id.imageButton14);
        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                walang_anuman.start();
            }
        });
        pause7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                walang_anuman.pause();
            }
        });

        //8-->
        final MediaPlayer pangalan_ko = MediaPlayer.create(this, R.raw.pangalan_ko);
        play8 = findViewById(R.id.imageButton15);
        pause8 = findViewById(R.id.imageButton16);
        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pangalan_ko.start();
            }
        });
        pause8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pangalan_ko.pause();
            }
        });

        //9-->
        final MediaPlayer pangalan_mo = MediaPlayer.create(this, R.raw.pangalan_mo);
        play9 = findViewById(R.id.imageButton17);
        pause9 = findViewById(R.id.imageButton18);
        play9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pangalan_mo.start();
            }
        });
        pause9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pangalan_mo.pause();
            }
        });

        //10-->
        final MediaPlayer paalam = MediaPlayer.create(this, R.raw.paalam);
        play10 = findViewById(R.id.imageButton19);
        pause10 = findViewById(R.id.imageButton20);
        play10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paalam.start();
            }
        });
        pause10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paalam.pause();
            }
        });

    }
}