package com.example.multilevel_threads;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextInputEditText edit_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();




    }
    public void initialization(){

//        toolbar =findViewById(R.id.toolbar);
        edit_password=findViewById(R.id.edit_password);


    }

}