package com.example.restaurantbooking;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantbooking.ui.login.LoginFragment;

public class acctCreatedActivity extends AppCompatActivity {
    private android.widget.Button log2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.acct_created);

        log2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.widget.Button btn = (android.widget.Button) findViewById(R.id.button);

                btn.setOnClickListener(new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View w) {
                        startActivity(new android.content.Intent(acctCreatedActivity.this, LoginFragment.class));
                    }
                });
            }
        });

    }

}

