package com.example.slahly_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class reservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
    }
    public void ShowReserved(View view) {
        Toast.makeText(getApplicationContext(),"reserved successfully, " +
                "slot:G3, " +
                "Your code:7122001", Toast.LENGTH_LONG).show();
}}