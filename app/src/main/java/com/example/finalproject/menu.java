package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {

    private ImageButton LessonsB, AssessmentB, HelpB, AboutB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        LessonsB = findViewById(R.id.LessonsB);
        AssessmentB = findViewById(R.id.AssessmentB);
        HelpB = findViewById(R.id.HelpB);
        AboutB = findViewById(R.id.HelpB);

        LessonsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLessons();
            }
        });
        AssessmentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAssessment();
            }
        });
        HelpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }
        });
        AboutB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

    }

    public void openLessons(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAssessment(){
        Intent intent = new Intent(this, Assessment.class);
        startActivity(intent);
    }
    public void openHelp(){
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }
    public void openAbout(){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}
