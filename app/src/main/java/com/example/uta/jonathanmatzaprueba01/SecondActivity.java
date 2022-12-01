package com.example.uta.jonathanmatzaprueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText nombre2;
    private EditText apellido2;
    private EditText divisor2;
    private Button cerrar2;
    private Button mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nombre2 = findViewById(R.id.txtNombre2);
        apellido2 = findViewById(R.id.txtApellido2);
        cerrar2 = findViewById(R.id.buttoncerrar);


        String nombr = getIntent().getStringExtra("nombre");
        nombre2.setText(nombr);

        String ape = getIntent().getStringExtra("apellido");
        apellido2.setText(ape);
        //control boton mostrar


    }
    public void onclick_Siguiente2(View view){
        String userName = nombre2.getText().toString();
        String password = apellido2.getText().toString();
        Intent siguiente = new Intent(this, ThirdActivity.class );
        siguiente.putExtra("nombreExtra", userName);
        siguiente.putExtra("apellidoExtra", password);
        startActivity(siguiente);

    }
    public void onclick_Cerrar2(View view){
        Intent siguiente = new Intent(this, MainActivity.class );
        String apellido = getIntent().getStringExtra("dividendo");
        String exponente = getIntent().getStringExtra("divisor");
        String numero = getIntent().getStringExtra("numero");


        String nmb = nombre2.getText().toString();
        String bas = apellido2.getText().toString();

        siguiente.putExtra("apellido", apellido);
        siguiente.putExtra("nombre", nmb);
        siguiente.putExtra("dividendo",bas);
        siguiente.putExtra("divisor",exponente);
        siguiente.putExtra("numero",numero);

        startActivity(siguiente);
    }
}