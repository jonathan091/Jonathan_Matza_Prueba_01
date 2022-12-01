package com.example.uta.jonathanmatzaprueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    private EditText nombre3;
    private EditText apellido3;
    private EditText base3;
    private EditText exponete3;
    private EditText numero3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}