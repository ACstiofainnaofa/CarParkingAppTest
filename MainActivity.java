package com.examplepackage.parkingappac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sbBtn = (Button)findViewById(R.id.dbBtn);
        //Parking rates activity call
        sbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dbIntent = new Intent(getApplicationContext(), Rates.class);
                startActivity(dbIntent);

            }
        });

        //Map activity call
        Button mapBtn = (Button)findViewById(R.id.mapBtn);
    mapBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent mapIntent = new Intent(getApplicationContext(), Map.class);
            startActivity(mapIntent);
        }
    });

        //Calendar activity call
        Button calBtn = (Button)findViewById(R.id.calendarBtn);
        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calIntent = new Intent(getApplicationContext(),Calendar.class);
                startActivity(calIntent);
            }
        });

        //Video activity call
        ImageButton vidBtn = (ImageButton)findViewById(R.id.videoBtn);
        vidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vidIntent = new Intent(getApplicationContext(), Video.class);
                startActivity(vidIntent);
            }
        });
    }
}
