package com.example.grancentre.Hotels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.grancentre.MainActivity;
import com.example.grancentre.R;
import com.example.grancentre.Restaurants.Restaurants;

public class Hotels extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String hl1 = "https://www.barcelo.com/es-es/barcelo-sants/";
    String hl2 = "https://www.barcelo.com/es-es/occidental-barcelona-1929/";
    String hl3 = "https://www.barcelo.com/es-es/occidental-diagonal-414/";
    String hl4 = "https://www.barcelo.com/es-es/barcelo-raval/";
    String hl5 = "https://www.barcelo.com/es-es/occidental-atenea-mar/";
    String hl6 = "https://www.barcelo.com/es-es/barcelo-punta-umbria-beach-resort/";
    String hl7 = "https://www.barcelo.com/es-es/barcelo-lanzarote-active-resort/";
    String hl8 = "https://www.barcelo.com/es-es/barcelo-margaritas/";
    String hl9 = "https://www.barcelo.com/es-es/royal-hideaway-sancti-petri/";
    String hl10 = "https://www.barcelo.com/es-es/barcelo-bavaro-palace/";
    String hl11 = "https://www.barcelo.com/es-es/barcelo-torre-de-madrid/";
    String hl12 = "https://www.barcelo.com/es-es/barcelo-santiago/";
    String hl13 = "https://www.barcelo.com/es-es/barcelo-sevilla-renacimiento/";
    String hl14 = "https://www.barcelo.com/es-es/barcelo-bilbao-nervion/";
    String hl15 = "https://www.barcelo.com/es-es/barcelo-fuerteventura-castillo/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
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

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl1));
                startActivity(intent);
            }
        });

        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl2));
                startActivity(intent);
            }
        });

        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl3));
                startActivity(intent);
            }
        });

        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl4));
                startActivity(intent);
            }
        });

        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl5));
                startActivity(intent);
            }
        });

        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl6));
                startActivity(intent);
            }
        });

        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl7));
                startActivity(intent);
            }
        });

        h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl8));
                startActivity(intent);
            }
        });

        h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl9));
                startActivity(intent);
            }
        });

        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl10));
                startActivity(intent);
            }
        });

        h11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl11));
                startActivity(intent);
            }
        });

        h12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl12));
                startActivity(intent);
            }
        });

        h13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl13));
                startActivity(intent);
            }
        });

        h14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl14));
                startActivity(intent);
            }
        });

        h15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(hl15));
                startActivity(intent);
            }
        });




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

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void onClick(View view) {

        Intent Menu = new Intent(this, MainActivity.class);
        startActivity(Menu);
    }
}