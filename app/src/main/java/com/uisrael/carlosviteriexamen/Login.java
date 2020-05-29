package com.uisrael.carlosviteriexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText us, cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        us=findViewById(R.id.etUsuario);
        cont=findViewById(R.id.etContraseña);
    }

    public void Validar (View v){
        String usuario, contraseña;
        usuario=us.getText().toString();
        contraseña=cont.getText().toString();

        if (usuario.equals("estudiante2020") && contraseña.equals("uisrael2020")){
            //Intent intentAbrir=new Intent(Login.this, Registro.class);
            Intent intentEnviar= new Intent(Login.this, Registro.class);
            intentEnviar.putExtra("datoEnviado",usuario);
            //startActivity(intentAbrir);
            startActivity(intentEnviar);
            Toast.makeText(getApplicationContext(),"usuario y contraseña correctos", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"usuario o contraseña erroneos", Toast.LENGTH_LONG).show();
        }


    }
}
