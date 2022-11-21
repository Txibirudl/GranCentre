package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.grancentre.Restaurants.Restaurants;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton b1 = findViewById(R.id.bt1);
        ImageButton b2 = findViewById(R.id.bt2);
        ImageButton b3 = findViewById(R.id.bt3);
        ImageButton b4 = findViewById(R.id.bt4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.bt1) {
            Intent Restaurants = new Intent(this, Restaurants.class);
            startActivity(Restaurants);
        }

        if (view.getId()==R.id.bt2) {
            Intent Hotels = new Intent(this, com.example.grancentre.Hotels.Hotels.class);
            startActivity(Hotels);
        }

        if(view.getId()==R.id.bt3) {
            Intent Movies = new Intent(this, movies.class);
            startActivity(Movies);
        }


    }

}