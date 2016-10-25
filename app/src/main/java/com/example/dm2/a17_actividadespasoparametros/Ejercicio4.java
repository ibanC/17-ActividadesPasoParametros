package com.example.dm2.a17_actividadespasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Ejercicio4 extends AppCompatActivity {

    private EditText txtNombre,txtApellidos;
    private RadioButton rbMasculino,rbFemenino;
    private CheckBox chkMusica,chkLectura,chkDeportes,chkViajar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        txtNombre=(EditText)findViewById(R.id.textonombre);
        txtApellidos=(EditText)findViewById(R.id.textoapellido);
        rbMasculino=(RadioButton)findViewById(R.id.rbMasculino);
        rbFemenino=(RadioButton)findViewById(R.id.rbFemenino);
        chkMusica=(CheckBox) findViewById(R.id.chkmusica);
        chkLectura=(CheckBox)findViewById(R.id.chklectura);
        chkDeportes=(CheckBox)findViewById(R.id.chkdeportes);
        chkViajar=(CheckBox)findViewById(R.id.chkviajar);

        String nombre=txtNombre.getText().toString();
        String apellidos=txtApellidos.getText().toString();
        String sexo="";
        if(rbMasculino.isChecked())
        {
            sexo=rbMasculino.getText().toString();
        }
        else
        {
            if(rbFemenino.isChecked())
            {
                sexo=rbFemenino.getText().toString();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Debes seleccionar un sexo",Toast.LENGTH_LONG).show();
            }
        }

        String aficiones="";
       if (chkMusica.isChecked())
       {
           aficiones+=chkMusica.getText().toString();
       }
        else
       {
           if (chkLectura.isChecked())
           {
               aficiones+=chkLectura.getText().toString();
           }
           else
           {
               if (chkDeportes.isChecked())
               {
                   aficiones+=chkDeportes.getText().toString();
               }
               else
               {
                   if (chkViajar.isChecked())
                   {
                       aficiones+=chkViajar.getText().toString();
                   }
               }
           }
       }


    }
}
