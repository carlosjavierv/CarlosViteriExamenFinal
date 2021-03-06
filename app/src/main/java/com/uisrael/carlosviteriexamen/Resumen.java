package com.uisrael.carlosviteriexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    TextView cajaRecibir1, cajaRecibir2, cajaRecibir3, cajaRecibir4;
    Bundle  dato1, dato2, dato3, dato4, dato5, dato6, dato7, dato8, dato9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        cajaRecibir1=findViewById(R.id.txtUsuario);
        cajaRecibir2=findViewById(R.id.txtNombre);
        cajaRecibir3=findViewById(R.id.txtMonto);
        cajaRecibir4=findViewById(R.id.etResumen);
        dato1=getIntent().getExtras();
        dato2=getIntent().getExtras();
        dato3=getIntent().getExtras();
        dato4=getIntent().getExtras();
        dato5=getIntent().getExtras();
        dato6=getIntent().getExtras();
        dato7=getIntent().getExtras();
        dato8=getIntent().getExtras();
        String datoRecibido1=dato1.getString("datoEnviado1");
        String datoRecibido2=dato2.getString("datoEnviado2");
        String datoRecibido3=dato3.getString("datoEnviado3");
        String datoRecibido4=dato4.getString("datoEnviado4");
        String datoRecibido5=dato5.getString("datoEnviado5");
        String datoRecibido6=dato6.getString("datoEnviado6");
        String datoRecibido7=dato7.getString("datoEnviado7");
        String datoRecibido8=dato8.getString("datoEnviado8");

        cajaRecibir1.setText(datoRecibido1);
        cajaRecibir2.setText(datoRecibido2);
        cajaRecibir3.setText(datoRecibido3);
        cajaRecibir4.setText(datoRecibido4 + " " + datoRecibido5 + " " + datoRecibido6 + " " + datoRecibido7 + " " + datoRecibido8);
    }

    public void Cerrar (View v){
        finish();
        System.exit(0);

    }
}