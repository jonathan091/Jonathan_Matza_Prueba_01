package com.example.uta.jonathanmatzaprueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    private EditText nombre3;
    private EditText apellido3;
    private EditText dividendo3;
    private EditText divisor3;
    private EditText numeroInv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        nombre3=findViewById(R.id.txtNombre3);
        apellido3=findViewById(R.id.txtApellido3);
        dividendo3=findViewById(R.id.txtDividendo3);
        divisor3=findViewById(R.id.txtDivisor3);
        numeroInv3=findViewById(R.id.txtNumeriIv3);
        Bundle extras = getIntent().getExtras();
        String n = extras.getString("nombreExtra");
        String a = extras.getString("apellidoExtra");

        nombre3.setText(n);
        apellido3.setText(a);

    }

    public void onclick_Cerrar3(View view){
        Intent siguiente = new Intent(this, SecondActivity.class );
        String nomb = nombre3.getText().toString();
        String apell = apellido3.getText().toString();
        String base = dividendo3.getText().toString();
        String exponen = divisor3.getText().toString();
        String numer = numeroInv3.getText().toString();
        siguiente.putExtra("nombre", nomb);
        siguiente.putExtra("apellido", apell);
        siguiente.putExtra("dividendo", base);
        siguiente.putExtra("divisor", exponen);
        siguiente.putExtra("numero", numer);
        startActivity(siguiente);


    }
}