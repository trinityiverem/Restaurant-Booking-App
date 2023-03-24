package com.example.restaurantbooking;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signUpActivity extends AppCompatActivity {
    private EditText signupUsername, signupEmail, signupPassword;
    private Button SignUpButton;
    private TextView loginRedirectText;
    private FirebaseAuth auth;



    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        loginRedirectText = findViewById(R.id.login_redirect);
        auth = FirebaseAuth.getInstance();
        signupUsername = findViewById(R.id.signup_username);
        signupEmail = findViewById(R.id.signup_email);
        signupPassword = findViewById(R.id.signup_password);
        SignUpButton = findViewById(R.id.sign_up_button);



        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userN = signupUsername.getText().toString().trim();
                String user = signupEmail.getText().toString().trim();
                String pass = signupPassword.getText().toString().trim();

                if (userN.isEmpty()){
                    signupUsername.setError("Username cannot be empty");
                }
                if (user.isEmpty()){
                    signupEmail.setError("Email cannot be empty");
                }

                if (pass.isEmpty()){
                    signupPassword.setError("Password cannot be empty");
                } else{
                    auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(signUpActivity.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(signUpActivity.this, logInActivity.class));
                        }else{
                            Toast.makeText(signUpActivity.this, "SignUp Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                        }
                    });
                }
                loginRedirectText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new android.content.Intent(signUpActivity.this, logInActivity.class));

                    }
                });
//User is signed in use an intent to move to another activity

            }
    });
}
}


