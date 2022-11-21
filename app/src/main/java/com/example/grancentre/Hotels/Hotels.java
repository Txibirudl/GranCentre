package com.example.grancentre.Hotels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.grancentre.R;

public class Hotels extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);






        Spinner spin = (Spinner) findViewById(R.id.SpinnerHotels);
            spin.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.estrellas_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spin.setAdapter(adapter);


    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        CardView h1 = findViewById(R.id.Hotel1);
        CardView h2 = findViewById(R.id.Hotel2);
        CardView h3 = findViewById(R.id.Hotel3);
        CardView h4 = findViewById(R.id.Hotel4);
        CardView h5 = findViewById(R.id.Hotel5);
        CardView h6 = findViewById(R.id.Hotel6);
        CardView h7 = findViewById(R.id.Hotel7);
        CardView h8 = findViewById(R.id.Hotel8);
        CardView h9 = findViewById(R.id.Hotel9);
        CardView h10 = findViewById(R.id.Hotel10);
        CardView h11 = findViewById(R.id.Hotel11);
        CardView h12 = findViewById(R.id.Hotel12);
        CardView h13 = findViewById(R.id.Hotel13);
        CardView h14 = findViewById(R.id.Hotel14);
        CardView h15 = findViewById(R.id.Hotel15);

        switch (i)
        {
            case 0:
                h1.setVisibility(view.VISIBLE);
                h2.setVisibility(view.VISIBLE);
                h3.setVisibility(view.VISIBLE);
                h4.setVisibility(view.VISIBLE);
                h5.setVisibility(view.VISIBLE);
                h6.setVisibility(view.VISIBLE);
                h7.setVisibility(view.VISIBLE);
                h8.setVisibility(view.VISIBLE);
                h9.setVisibility(view.VISIBLE);
                h10.setVisibility(view.VISIBLE);
                h11.setVisibility(view.VISIBLE);
                h12.setVisibility(view.VISIBLE);
                h13.setVisibility(view.VISIBLE);
                h14.setVisibility(view.VISIBLE);
                h15.setVisibility(view.VISIBLE);

                break;

            case 1:

                h1.setVisibility(view.VISIBLE);
                h2.setVisibility(view.VISIBLE);
                h3.setVisibility(view.VISIBLE);
                h4.setVisibility(view.GONE);
                h5.setVisibility(view.GONE);
                h6.setVisibility(view.GONE);
                h7.setVisibility(view.GONE);
                h8.setVisibility(view.GONE);
                h9.setVisibility(view.GONE);
                h10.setVisibility(view.GONE);
                h11.setVisibility(view.GONE);
                h12.setVisibility(view.GONE);
                h13.setVisibility(view.GONE);
                h14.setVisibility(view.GONE);
                h15.setVisibility(view.GONE);
                break;

            case 2:

                h1.setVisibility(view.GONE);
                h2.setVisibility(view.GONE);
                h3.setVisibility(view.GONE);
                h4.setVisibility(view.VISIBLE);
                h5.setVisibility(view.VISIBLE);
                h6.setVisibility(view.VISIBLE);
                h7.setVisibility(view.GONE);
                h8.setVisibility(view.GONE);
                h9.setVisibility(view.GONE);
                h10.setVisibility(view.GONE);
                h11.setVisibility(view.GONE);
                h12.setVisibility(view.GONE);
                h13.setVisibility(view.GONE);
                h14.setVisibility(view.GONE);
                h15.setVisibility(view.GONE);
                break;

            case 3:

                h1.setVisibility(view.GONE);
                h2.setVisibility(view.GONE);
                h3.setVisibility(view.GONE);
                h4.setVisibility(view.GONE);
                h5.setVisibility(view.GONE);
                h6.setVisibility(view.GONE);
                h7.setVisibility(view.VISIBLE);
                h8.setVisibility(view.VISIBLE);
                h9.setVisibility(view.VISIBLE);
                h10.setVisibility(view.GONE);
                h11.setVisibility(view.GONE);
                h12.setVisibility(view.GONE);
                h13.setVisibility(view.GONE);
                h14.setVisibility(view.GONE);
                h15.setVisibility(view.GONE);
                break;

            case 4:
                h1.setVisibility(view.GONE);
                h2.setVisibility(view.GONE);
                h3.setVisibility(view.GONE);
                h4.setVisibility(view.GONE);
                h5.setVisibility(view.GONE);
                h6.setVisibility(view.GONE);
                h7.setVisibility(view.GONE);
                h8.setVisibility(view.GONE);
                h9.setVisibility(view.GONE);
                h10.setVisibility(view.VISIBLE);
                h11.setVisibility(view.VISIBLE);
                h12.setVisibility(view.VISIBLE);
                h13.setVisibility(view.GONE);
                h14.setVisibility(view.GONE);
                h15.setVisibility(view.GONE);
                break;

            case 5:
                h1.setVisibility(view.GONE);
                h2.setVisibility(view.GONE);
                h3.setVisibility(view.GONE);
                h4.setVisibility(view.GONE);
                h5.setVisibility(view.GONE);
                h6.setVisibility(view.GONE);
                h7.setVisibility(view.GONE);
                h8.setVisibility(view.GONE);
                h9.setVisibility(view.GONE);
                h10.setVisibility(view.GONE);
                h11.setVisibility(view.GONE);
                h12.setVisibility(view.GONE);
                h13.setVisibility(view.VISIBLE);
                h14.setVisibility(view.VISIBLE);
                h15.setVisibility(view.VISIBLE);
                break;

            default:

                break;

        }

    }

}