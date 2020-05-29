package com.uisrael.carlosviteriexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {

    EditText centro;
    RadioButton rb1,rb2;
    CheckBox ch1,ch2,ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        centro=findViewById(R.id.etCentro);
        ch1=findViewById(R.id.cbFutbol);
        ch2=findViewById(R.id.cbEcuavoley);
        ch3=findViewById(R.id.cbNatacion);
        rb1=findViewById(R.id.rbFrances);
        rb2=findViewById(R.id.rbProtugues);

    }

    public void Seguir (View v){

        String cen, fut, ecu, nat, fran, port;
        cen=centro.getText().toString();
        Intent intentEnviar2=new Intent(Encuesta.this,Resumen.class);
        intentEnviar2.putExtra("datoEnviado2",cen);
        startActivity(intentEnviar2);
        //Intent intentEnviar1=new Intent(Encuesta.this,Resumen.class);
        //intentEnviar1.putExtra("datoEnviado2",cen);
        //startActivity(intentEnviar1);
    }
}
