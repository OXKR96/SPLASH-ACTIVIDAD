package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button guardar, regresar;
    EditText usuario, contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.txtUSUARIO);
        contraseña = findViewById(R.id.textContraseña);
        guardar = findViewById(R.id.btnGuardar);
        regresar= findViewById(R.id.btnRegresar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario.setError(null);
                if (usuario.getText().toString().equals(""))
                    usuario.setError("Usuario Vacio");
                usuario.requestFocus();

            }
        });
    }
}