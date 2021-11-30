package com.example.interfazpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view){
        Intent intent = new Intent (MainActivity.this,MainActivity2.class);

        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtFecha = (EditText)findViewById(R.id.txtFecha);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);


        Bundle b = new Bundle();

        b.putString("NOMBRE", txtNombre.getText().toString() + " \n Nacido: " + txtFecha.getText().toString() +"\n Telefono: " + txtTelefono.getText().toString());

        intent.putExtras(b);

        startActivity(intent);


    }
}