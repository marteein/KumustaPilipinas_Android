package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    private ImageButton restaurant;
    private ImageButton transpo;
    private ImageButton greetings;
    private ImageButton hotels;
    private ImageButton markt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        restaurant = findViewById(R.id.restaurant);
        transpo = findViewById(R.id.transpo);
        greetings = findViewById(R.id.greetings);
        hotels = findViewById(R.id.hotels);
        markt = findViewById(R.id.markt);

        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResto();
            }
        });

        transpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTravel();
            }
        });

        greetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGreetings();
            }
        });

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHotels();
            }
        });

        markt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMarket();
            }
        });

    }
    public void openResto(){
        Intent intent = new Intent(this, Resto.class);
        startActivity(intent);}

    public void openTravel(){
        Intent intent = new Intent(this, Travel.class);
        startActivity(intent);}

    public void openGreetings(){
        Intent intent = new Intent(this, Greetings.class);
        startActivity(intent);}

    public void openHotels(){
        Intent intent = new Intent(this, Hotel.class);
        startActivity(intent);}

    public void openMarket(){
        Intent intent = new Intent(this, Market.class);
        startActivity(intent);}
}