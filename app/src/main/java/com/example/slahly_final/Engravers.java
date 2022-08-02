package com.example.slahly_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Engravers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engravers);
        Button button1 = (Button) findViewById(R.id.buttoncontinue);
        Button btnmaps = (Button) findViewById(R.id.btnlocation);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReservationActivity();
            }
        });
        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity();
            }
        });

    }

    public void openMapsActivity() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }



    public void openReservationActivity() {
        Intent intent1 = new Intent(this, reservation.class);
        startActivity(intent1);
    }

}

