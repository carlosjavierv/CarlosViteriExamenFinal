package com.uisrael.carlosviteriexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    TextView cajaRecibir;
    Bundle dato;
    EditText monto, pago, nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        cajaRecibir=findViewById(R.id.txtRecibir);
        dato=getIntent().getExtras();
        String datoRecibido=dato.getString("datoEnviado");
        cajaRecibir.setText(datoRecibido);
        monto=findViewById(R.id.etMonto);
        pago=findViewById(R.id.etPago);
        nombre=findViewById(R.id.etNombre);

    }

    public void Calculo (View v){
        double valor, recargo, resul, total;
        valor=Double.parseDouble(monto.getText().toString());
        total=1800.00;
        recargo=total * 0.05;
        resul=((total-valor)/3)+recargo;
        pago.setText(Double.toString(resul));

    }

    public void Guardar (View v){
        String pag1, nom;
        pag1=pago.getText().toString();
        nom=nombre.getText().toString();

        if(pag1.equals("")){

            Toast.makeText(getApplicationContext(),"DEBE INGRESAR TODOS LOS DATOS", Toast.LENGTH_LONG).show();
        } else {

            Toast.makeText(getApplicationContext(),"Elemento guardado con exito", Toast.LENGTH_LONG).show();

        }

        Intent intentAbrir=new Intent(Registro.this, Encuesta.class);
        Intent intentEnviar1= new Intent(Registro.this, Resumen.class);
        intentEnviar1.putExtra("datoEnviado1",nom);
        intentEnviar1.putExtra("datoEnviado8",pag1);
        startActivity(intentAbrir);
        startActivity(intentEnviar1);
    }

}
