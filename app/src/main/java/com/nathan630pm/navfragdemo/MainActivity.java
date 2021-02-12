package com.nathan630pm.navfragdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private NavHostFragment navHostFragment;
    private NavController nav;

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);

        nav = Navigation.findNavController(this, R.id.fragment);

        appBarConfiguration = new AppBarConfiguration.Builder(R.id.homeFragment, R.id.profileFragment, R.id.settingsFragment).build();
        NavigationUI.setupWithNavController(bottomNavigationView, nav);

        NavigationUI.setupActionBarWithNavController(this, nav, appBarConfiguration);

    }
}