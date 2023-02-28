package com.example.restaurantbooking;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //to change from home page to sign up page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.Button btn = (android.widget.Button) findViewById(R.id.button2);
        android.widget.Button btnLogIn = (android.widget.Button) findViewById(R.id.button);

        btn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new android.content.Intent(MainActivity.this, signUpActivity.class));
            }
        });
        //open log in page after clicking log in button
        btnLogIn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v1) {
                startActivity(new android.content.Intent(MainActivity.this, logInActivity.class));
            }
        });
    }
}


