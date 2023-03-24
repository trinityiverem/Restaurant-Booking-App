package com.example.restaurantbooking;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class acctCreatedActivity extends AppCompatActivity {
    public android.widget.Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.acct_created);
        android.widget.Button btnLogIn = (android.widget.Button) findViewById(R.id.buttonL);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                startActivity(new android.content.Intent(acctCreatedActivity.this, logInActivity.class));
            }
        });

    }

}

