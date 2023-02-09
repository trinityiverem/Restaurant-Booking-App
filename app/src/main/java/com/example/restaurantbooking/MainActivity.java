package com.example.restaurantbooking;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.Button btn = (android.widget.Button)findViewById(R.id.button2);

        btn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new android.content.Intent(MainActivity.this, signUpActivity.class));
            }
        });
    }
}