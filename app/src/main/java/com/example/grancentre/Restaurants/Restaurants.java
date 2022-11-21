package com.example.grancentre.Restaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.os.Bundle;

import com.example.grancentre.R;


public class Restaurants extends AppCompatActivity implements View.OnClickListener{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);




            Button telefonAtarasii = (Button) findViewById(R.id.telefonAtarasii);
            Button webAtarasii = (Button) findViewById(R.id.webAtarasii);
            Button mapAtarasii = (Button) findViewById(R.id.mapAtarasii);

            Button telefonDominos = (Button) findViewById(R.id.telefonDominos);
            Button webDominos = (Button) findViewById(R.id.webDominos);
            Button mapDominos = (Button) findViewById(R.id.mapDominos);

            Button telefonTelepizza = (Button) findViewById(R.id.telefonTelepizza);
            Button webTelepizza = (Button) findViewById(R.id.webTelepizza);
            Button mapTelepizza = (Button) findViewById(R.id.mapTelepizza);

            Button telefonMcdonalds = (Button) findViewById(R.id.telefonMcdonalds);
            Button webMcdonalds = (Button) findViewById(R.id.webMcdonalds);
            Button mapMcdonalds = (Button) findViewById(R.id.mapMcdonalds);

            Button telefonMifune = (Button) findViewById(R.id.telefonMifune);
            Button webMifune = (Button) findViewById(R.id.webMifune);
            Button mapMifune = (Button) findViewById(R.id.mapMifune);

            Button telefonWagaya = (Button) findViewById(R.id.telefonWagaya);
            Button webWagaya = (Button) findViewById(R.id.webWagaya);
            Button mapWagaya = (Button) findViewById(R.id.mapWagaya);




            telefonAtarasii.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0123456789"));
                    startActivity(intent);

                }
            });

            webAtarasii.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.atarasiisushi.es/"));
                    startActivity(intent);
                }
            });

            mapAtarasii.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.google.es/maps/place/Restaurant+Atarasii/@41.6098489,2.2882033,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c75e807f0365:0x48b5c16f2eb91816!8m2!3d41.6098489!4d2.2894053?hl=es&authuser=0"));
                    startActivity(intent);
                }
            });





            telefonDominos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0123456789"));
                    startActivity(intent);

                }
            });

            webDominos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.dominospizza.es/tiendas-dominos-pizza/tiendas/barcelona-granollers-avda-sant-esteve-22-36"));
                    startActivity(intent);
                }
            });

            mapDominos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.google.es/maps/place/Domino's+Pizza/@41.6063324,2.2844122,14.34z/data=!4m9!1m2!2m1!1sDomino's+Pizza!3m5!1s0x12a4c7294d75fe0f:0xf7edc4913abb663f!8m2!3d41.604029!4d2.290498!15sCg5Eb21pbm8ncyBQaXp6YSIDiAEBWhAiDmRvbWlubydzIHBpenphkgEWcGl6emFfZGVsaXZlcnlfc2VydmljZZoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VOMWFUUjFXVGgzUlJBQuABAA?hl=es&authuser=0"));
                    startActivity(intent);

                }
            });






            telefonTelepizza.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0123456789"));
                    startActivity(intent);

                }
            });

            webTelepizza.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.telepizza.es/"));
                    startActivity(intent);
                }
            });

            mapTelepizza.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.google.es/maps/place/Telepizza+Granollers+-+Comida+a+Domicilio/@41.608981,2.2570732,14z/data=!4m9!1m2!2m1!1sDomino's+Pizza!3m5!1s0x12a4c7c87af4abd5:0xc4cc4c847c0c8924!8m2!3d41.608981!4d2.2846466!15sCg5Eb21pbm8ncyBQaXp6YSIDiAEBWhAiDmRvbWlubydzIHBpenphkgEQcGl6emFfcmVzdGF1cmFudJoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VSak1uVXlObkZCUlJBQuABAA?hl=es&authuser=0"));
                    startActivity(intent);

                }
            });





            telefonMcdonalds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0123456789"));
                    startActivity(intent);

                }
            });

            webMcdonalds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://mcdonalds.es/"));
                    startActivity(intent);
                }
            });

            mapMcdonalds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.google.es/maps/place/McDonald's/@41.6134911,2.282419,13.87z/data=!4m9!1m2!2m1!1sMcDonald's!3m5!1s0x12a4c87898eb6b0b:0x580365cf432f0bbc!8m2!3d41.6114405!4d2.3030235!15sCgpNY0RvbmFsZCdzIgOIAQFaDCIKbWNkb25hbGQnc5IBFGZhc3RfZm9vZF9yZXN0YXVyYW504AEA?hl=es&authuser=0"));
                    startActivity(intent);

                }
            });




            telefonMifune.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0123456789"));
                    startActivity(intent);

                }
            });

            webMifune.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.mifuneneko.com/es/"));
                    startActivity(intent);
                }
            });

            mapMifune.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.google.es/maps/place/Mifune+Neko/@41.6098196,2.2816417,17z/data=!3m2!4b1!5s0x12a4c7c8ec9b5593:0x7c1fbc4235bab3c0!4m5!3m4!1s0x12a4c7c8eb5df24b:0xe720586c9f6f044a!8m2!3d41.6098197!4d2.2861264?hl=es&authuser=0"));
                    startActivity(intent);

                }
            });





            telefonWagaya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0123456789"));
                    startActivity(intent);

                }
            });

            webWagaya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.wagaya.es/"));
                    startActivity(intent);
                }
            });

            mapWagaya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.google.es/maps/place/Wagaya+Restaurante/@41.6101948,2.2887805,17z/data=!3m1!4b1!4m5!3m4!1s0x12a4c7cfba6d74c5:0x179bfb3cc7202a6a!8m2!3d41.6101966!4d2.2909512?hl=es&authuser=0"));
                    startActivity(intent);

                }
            });


        }

        @Override
        public void onClick(View view) {

        }
    }

