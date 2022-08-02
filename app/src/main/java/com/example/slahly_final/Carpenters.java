package com.example.slahly_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class Carpenters  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpenters);
    }

    public void showSaved(View view) {
        Toast.makeText(getApplicationContext(),"your new data saved successfully",Toast.LENGTH_LONG).show();
    }

    public void showCancelled(View view) {
        Toast.makeText(getApplicationContext(),"reservation cancelled successfully, " +
                "Fees:10 L.E",Toast.LENGTH_LONG).show();
    }
}
