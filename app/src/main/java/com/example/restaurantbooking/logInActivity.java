package com.example.restaurantbooking;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;

import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class logInActivity extends AppCompatActivity {


    private EditText loginUser, loginEmail, loginPassword;
    private Button logInButton;
    private FirebaseAuth auth;
    private TextView signupRedirectText;


    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        auth = FirebaseAuth.getInstance();
        loginUser = findViewById(R.id.login_username);
        loginEmail = findViewById(R.id.login_email);
        loginPassword = findViewById(R.id.login_password);
        logInButton = findViewById(R.id.log_in_button);
        signupRedirectText = findViewById(R.id.textView);
        logInButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view2) {
                String email = loginEmail.getText().toString();
                String pass = loginPassword.getText().toString();
                if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    if (!pass.isEmpty()){
                        auth.signInWithEmailAndPassword(email, pass)
                                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                    @Override
                                    public void onSuccess(AuthResult authResult) {
                                        Toast.makeText(logInActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(logInActivity.this, MainActivity.class));
                                       // finish();
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                      Toast.makeText(logInActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                                    }
                                });
                    } else{
                        loginPassword.setError("Password cannot be empty");
                    }
                }else if(email.isEmpty()){
                    loginEmail.setError("Email cannot be empty");
                }else{
                    loginEmail.setError("Please enter valid email");
                }

            }
        });
        //Allow users with accounts to sign in
        signupRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(logInActivity.this, MainActivity.class));
            }
        });


    }

}




