package com.example.restaurantbooking;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class signUpActivity extends AppCompatActivity {
    private android.widget.EditText NameEditText;
    private android.widget.EditText EmailEditText;
    private android.widget.EditText PasswordEditText;
    private android.widget.Button SignUpButton;
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        NameEditText = (android.widget.EditText) findViewById(R.id.name_edit_text);
        EmailEditText = (android.widget.EditText) findViewById(R.id.email_edit_text);
        PasswordEditText = (android.widget.EditText) findViewById(R.id.password_edit_text);
        String name = NameEditText.getText().toString();
        String email = EmailEditText.getText().toString();
        String password = PasswordEditText.getText().toString();
        android.widget.Button SignUpButton = (android.widget.Button) findViewById(R.id.sign_up_button);
        SignUpButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view1){


                startActivity(new android.content.Intent(signUpActivity.this, acctCreatedActivity.class));
                    }
                });
            }



    }


