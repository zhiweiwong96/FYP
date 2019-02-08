package com.example.zw.fyp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginRegistrationActivity extends AppCompatActivity {

    private Button mLogin, mRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_registration);

        mLogin = (Button) findViewById(R.id.Login);
        mRegister = (Button) findViewById(R.id.Register);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LoginRegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LoginRegistrationActivity.this,RegistrationActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
