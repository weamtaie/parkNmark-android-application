package com.example.slahly_final.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.slahly_final.Carpenters;
import com.example.slahly_final.Engravers;
import com.example.slahly_final.Mechanics;
import com.example.slahly_final.R;
import com.example.slahly_final.empty;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_home);
        Button button1= (Button) findViewById(R.id.editbutton);
        Button button2= (Button) findViewById(R.id.parkbutton);
        Button button3= (Button) findViewById(R.id.buttonleave);
       // Button button3= (Button) findViewById(R.id.mechButton);


        button1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openCarpenterActivity();
            }
        });
        button2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openEngraverActivity();
            }
        });
        button3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openleaveActivity();
            }
        });
      /*  button3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openMechanicActivity();
            }
        });*/





    }
    public void openCarpenterActivity() {
        Intent intent1 = new Intent(this, Carpenters.class);
        startActivity(intent1);
    }

    public void openEngraverActivity() {
        Intent intent3 = new Intent(this, Engravers.class);
        startActivity(intent3);
    }
    public void openleaveActivity() {
        Intent intent4 = new Intent(this, empty.class);
        startActivity(intent4);
    }


}

