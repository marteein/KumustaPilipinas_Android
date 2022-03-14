package com.example.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Market extends AppCompatActivity {
    ImageButton play1, play2, play3, play4, play5, play6, play7, play8, play9, play10;
    ImageButton pause1, pause2, pause3, pause4, pause5, pause6, pause7, pause8, pause9, pause10;
    private Button m_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);


        m_quiz = findViewById(R.id.m_quiz);

        m_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMarketQuiz();
            }
        });

        //1-->
        final MediaPlayer magkano = MediaPlayer.create(this, R.raw.magkano);
        play1 = findViewById(R.id.imageButton);
        pause1 = findViewById(R.id.imageButton2);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magkano.start();
            }
        });
        pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magkano.pause();
            }
        });

        //2-->
        final MediaPlayer mahal = MediaPlayer.create(this, R.raw.mahal);
        play2 = findViewById(R.id.imageButton3);
        pause2 = findViewById(R.id.imageButton4);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mahal.start();
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mahal.pause();
            }
        });

        //3-->
        final MediaPlayer tawad = MediaPlayer.create(this, R.raw.tawad);
        play3 = findViewById(R.id.imageButton5);
        pause3 = findViewById(R.id.imageButton6);
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tawad.start();
            }
        });
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tawad.pause();
            }
        });

        //4-->
        final MediaPlayer gusto_nito = MediaPlayer.create(this, R.raw.gusto_nito);
        play4 = findViewById(R.id.imageButton7);
        pause4 = findViewById(R.id.imageButton8);
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gusto_nito.start();
            }
        });
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gusto_nito.pause();
            }
        });

        //5-->
        final MediaPlayer gusto_yan = MediaPlayer.create(this, R.raw.gusto_yan);
        play5 = findViewById(R.id.imageButton9);
        pause5 = findViewById(R.id.imageButton10);
        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gusto_yan.start();
            }
        });
        pause5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gusto_yan.pause();
            }
        });

        //6-->
        final MediaPlayer inyo_sukli = MediaPlayer.create(this, R.raw.inyo_sukli);
        play6 = findViewById(R.id.imageButton11);
        pause6 = findViewById(R.id.imageButton12);
        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inyo_sukli.start();
            }
        });
        pause6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inyo_sukli.pause();
            }
        });

        //7-->
        final MediaPlayer kulang_sukli = MediaPlayer.create(this, R.raw.kulang_sukli);
        play7 = findViewById(R.id.imageButton13);
        pause7 = findViewById(R.id.imageButton14);
        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kulang_sukli.start();
            }
        });
        pause7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kulang_sukli.pause();
            }
        });

        //8-->
        final MediaPlayer sobra_sukli = MediaPlayer.create(this, R.raw.sobra_sukli);
        play8 = findViewById(R.id.imageButton15);
        pause8 = findViewById(R.id.imageButton16);
        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sobra_sukli.start();
            }
        });
        pause8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sobra_sukli.pause();
            }
        });

        //9-->
        final MediaPlayer malaki = MediaPlayer.create(this, R.raw.malaki);
        play9 = findViewById(R.id.imageButton17);
        pause9 = findViewById(R.id.imageButton18);
        play9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                malaki.start();
            }
        });
        pause9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                malaki.pause();
            }
        });

        //10-->
        final MediaPlayer maliit = MediaPlayer.create(this, R.raw.maliit);
        play10 = findViewById(R.id.imageButton19);
        pause10 = findViewById(R.id.imageButton20);
        play10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maliit.start();
            }
        });
        pause10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maliit.pause();
            }
        });
    }
    public void openMarketQuiz(){
        }
}