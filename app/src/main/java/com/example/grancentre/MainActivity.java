package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.os.Bundle;
import com.example.grancentre.Hotels.Hotels;
import com.example.grancentre.Restaurants.Restaurants;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton b1= findViewById(R.id.bt1);
        ImageButton b2= findViewById(R.id.bt2);
        ImageButton b3= findViewById(R.id.bt3);
        ImageButton b4= findViewById(R.id.bt4);

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
            Intent Hotels = new Intent(this, Restaurants.class);
            startActivity(Hotels);
        }
        if (view.getId()==R.id.bt3) {
            Intent a = new Intent(this, Restaurants.class);
            startActivity(a);
        }
        if (view.getId()==R.id.bt4) {
            Intent b = new Intent(this, Restaurants.class);
            startActivity(b);
        }
    }

}