package com.example.restaurantbooking;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class logInActivity extends AppCompatActivity {



    private android.widget.EditText NameEditText;
    private android.widget.EditText EmailEditText;
    private android.widget.EditText PasswordEditText;
    private android.widget.Button SignUpButton;
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        NameEditText = (android.widget.EditText) findViewById(R.id.name_edit_text);
        PasswordEditText = (android.widget.EditText) findViewById(R.id.password_edit_text);
        String name = NameEditText.getText().toString();
        String email = EmailEditText.getText().toString();
        String password = PasswordEditText.getText().toString();
        android.widget.Button SignUpButton = (android.widget.Button) findViewById(R.id.sign_up_button);

        SignUpButton.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(android.view.View view1){
                startActivity(new android.content.Intent(logInActivity.this, HomePage.class));
            }
        });
    }



}

