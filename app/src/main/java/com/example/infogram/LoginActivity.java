package com.example.infogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.infogram.view.ContainerActivity;
import com.example.infogram.view.CreateAccountMainActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void VamosCreaUnacuenta(View view){


        Intent intent = new Intent(this, CreateAccountMainActivity.class);

        startActivity(intent);


    }

    public void login(View view) {

        Intent intent = new Intent(this , ContainerActivity.class);

        startActivity(intent);

    }
}