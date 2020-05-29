package com.uisrael.carlosviteriexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {

    TextView cajarecibir1, cajarecibir2, cajarecibir3;
    Bundle dato1, dato2, dato3;

    EditText centro;
    RadioButton rb1,rb2;
    CheckBox ch1,ch2,ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        centro=findViewById(R.id.etCentro);
        cajarecibir1=findViewById(R.id.txtRecibir1);
        cajarecibir2=findViewById(R.id.txtRecibir2);
        cajarecibir3=findViewById(R.id.txtRecibir3);

        dato1=getIntent().getExtras();
        dato2=getIntent().getExtras();
        dato3=getIntent().getExtras();
        String datoRecibido1=dato1.getString("datoEnviado1");
        String datoRecibido2=dato2.getString("datoEnviado2");
        String datoRecibido3=dato3.getString("datoEnviado3");
        cajarecibir1.setText(datoRecibido1);
        cajarecibir2.setText(datoRecibido2);
        cajarecibir3.setText(datoRecibido3);

        ch1=findViewById(R.id.cbFutbol);
        ch2=findViewById(R.id.cbEcuavoley);
        ch3=findViewById(R.id.cbNatacion);
        rb1=findViewById(R.id.rbFrances);
        rb2=findViewById(R.id.rbProtugues);

    }

    public void Seguir (View v){

        String cen, fut, ecu, nat, idio, usu, nom, pag1;
        cen=centro.getText().toString();
        usu=cajarecibir1.getText().toString();
        nom=cajarecibir2.getText().toString();
        pag1=cajarecibir3.getText().toString();

        Intent intentEnviar2=new Intent(Encuesta.this,Resumen.class);
        intentEnviar2.putExtra("datoEnviado1",usu);
        intentEnviar2.putExtra("datoEnviado2",nom);
        intentEnviar2.putExtra("datoEnviado3",pag1);
        intentEnviar2.putExtra("datoEnviado4",cen);


        //Intent intentEnviar1=new Intent(Encuesta.this,Resumen.class);
        //intentEnviar1.putExtra("datoEnviado2",cen);
        //startActivity(intentEnviar1);
        if(ch1.isChecked()==true){
            fut=ch1.getText().toString();
            intentEnviar2.putExtra("datoEnviado5",fut);
        }
        else{
            fut=" ";
            intentEnviar2.putExtra("datoEnviado5",fut);
        }
        if(ch2.isChecked()==true){
            ecu=ch2.getText().toString();
            intentEnviar2.putExtra("datoEnviado6",ecu);
        }
        else{
            ecu=" ";
            intentEnviar2.putExtra("datoEnviado6",ecu);
        }
        if(ch3.isChecked()==true){
            nat=ch3.getText().toString();
            intentEnviar2.putExtra("datoEnviado7",nat);
        }
        else{
            nat=" ";
            intentEnviar2.putExtra("datoEnviado7",nat);
        }
        if(rb1.isChecked()==true){
            idio=rb1.getText().toString();
            intentEnviar2.putExtra("datoEnviado8",idio);
        }
        else{
            idio=rb2.getText().toString();
            intentEnviar2.putExtra("datoEnviado8",idio);
        }
        startActivity(intentEnviar2);

    }
}


