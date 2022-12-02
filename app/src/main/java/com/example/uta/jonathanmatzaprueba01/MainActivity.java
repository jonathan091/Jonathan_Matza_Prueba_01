package com.example.uta.jonathanmatzaprueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText apellido;
    private EditText dividendo;
    private EditText divisor;
    private EditText parteEntera;
    private EditText residuo;
    private EditText numInvertido;

    private Button mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre= findViewById(R.id.txtNombre);
        apellido=findViewById(R.id.txtApellid);
        dividendo=findViewById(R.id.txtDividendo);
        divisor=findViewById(R.id.txtDivisor);
        parteEntera=findViewById(R.id.txtParteEntera);
        numInvertido=findViewById(R.id.txtNumeroInv);
        mostrar=findViewById(R.id.buttonMostrar);
        residuo=findViewById(R.id.txtResiduo);

        String nombr = getIntent().getStringExtra("nombre");
        nombre.setText(nombr);

        String ape = getIntent().getStringExtra("apellido");
        apellido.setText(ape);

        String divid = getIntent().getStringExtra("dividendo");
        dividendo.setText(divid);

        String diviso = getIntent().getStringExtra("divisor");
        divisor.setText(diviso);
        //control boton mostrar
        if (apellido.length()==0){
            mostrar.setEnabled(false);
        }else{
            mostrar.setEnabled(true);
        }
    }
    public void Onclik_continuar(View view){
        Intent siguiente = new Intent(this, SecondActivity.class );
        startActivity(siguiente);
    }

    public void Onclick_MostrarResultado(View view) {
        int  invertido = 0, resto;
       String num = getIntent().getStringExtra("numero");
        int numero = Integer.parseInt(num);
        while( numero > 0 ) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        String res = String.valueOf(invertido);
        numInvertido.setText(res);

        String dividendo = getIntent().getStringExtra("dividendo");
        String divisor = getIntent().getStringExtra("divisor");
        int n1 = Integer.parseInt(dividendo);
        int n2 = Integer.parseInt(divisor);
        



        c = 1;
        while( n1 >= n2){ //ciclo para la resta sucesiva

            n1 = n1 - n2;
            c++;       //variable cociente o resultado
        }
        int modulo= n1 % n2;

        String t = String.valueOf(c);
        parteEntera.setText(t);
        String g = String.valueOf(modulo);
          residuo .setText(g);


    }

}