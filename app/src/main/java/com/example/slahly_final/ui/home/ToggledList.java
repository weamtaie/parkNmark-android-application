package com.example.slahly_final.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.example.slahly_final.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.example.slahly_final.databinding.ActivityToggledListBinding;


public class ToggledList extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityToggledListBinding binding;

    @Override

    public boolean onNavigationItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.nav_about_us) {
            Intent intent1 = new Intent(this, AboutUs.class);
            startActivity(intent1);
        }
        else if (item.getItemId() == R.id.nav_contact_us) {
            Intent intent1 = new Intent(this, ContactUs.class);
            startActivity(intent1);
        }
        else if (item.getItemId() == R.id.nav_help) {
            Intent intent1 = new Intent(this, Help.class);
            startActivity(intent1);
        }
        else if (item.getItemId() == R.id.nav_log_out) {
            Intent intent1 = new Intent(this, LogOut.class);
            startActivity(intent1);
        }
        else if (item.getItemId() == R.id.nav_home) {
            Intent intent1 = new Intent(this, Home.class);
            startActivity(intent1);
        }
        //to prevent current item select over and over
            return true;
        }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityToggledListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarToggledList.toolbar);
        binding.appBarToggledList.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_about_us, R.id.nav_contact_us, R.id.nav_help, R.id.nav_log_out)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_toggled_list);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toggled_list, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_toggled_list);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}