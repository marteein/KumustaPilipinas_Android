package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class AppIntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_app_intro);

        addSlide(AppIntroFragment.newInstance("Kumusta Pilipinas!", "This App will help you communicate when you visit the Philippines",
                R.drawable.one, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("With Different Categories to choose from", "That will be suited for any scenario while traveling in the Philippines",
                R.drawable.two, ContextCompat.getColor(getApplicationContext(), R.color.colorAccent)));
        addSlide(AppIntroFragment.newInstance("Show the Love", "To the Philippines by experiencing the culture and language with the help of this App",
                R.drawable.three, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark)));
    }


    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),menu.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),menu.class);
        startActivity(intent);
        finish();
    }
}
