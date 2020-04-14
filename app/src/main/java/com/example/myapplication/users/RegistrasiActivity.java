package com.example.myapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.ornach.nobobutton.NoboButton;

import butterknife.ButterKnife;

public class RegistrasiActivity extends AppCompatActivity {

    NoboButton btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        btnDaftar = (NoboButton) findViewById(R.id.btnDaftar);

        btnDaftar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent i = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}
