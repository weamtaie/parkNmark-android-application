package com.example.slahly_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mechanics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanics);
        Button button1 = (Button) findViewById(R.id.buttonreq4);
        Button button2 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openMapsActivity();
            }

        });
        button2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openMapsActivity();
            }

        });
    }
    public void openMapsActivity() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

}
