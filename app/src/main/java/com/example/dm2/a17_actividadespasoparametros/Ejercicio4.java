package com.example.dm2.a17_actividadespasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Ejercicio4 extends AppCompatActivity {

    private EditText txtNombre,txtApellidos;
    private RadioButton rbMasculino,rbFemenino;
    private CheckBox chkMusica,chkLectura,chkDeportes,chkViajar;
    private Button butEnviar;
    private String aficiones;
    private String nombre;
    private String apellidos;
    private String sexo;

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
        butEnviar=(Button)findViewById(R.id.butEnviar) ;

        butEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aficiones = "";
                if (chkMusica.isChecked())
                {
                    aficiones +=chkMusica.getText().toString();
                }
                else
                {
                    if (chkLectura.isChecked())
                    {
                        aficiones +=chkLectura.getText().toString();
                    }
                    else
                    {
                        if (chkDeportes.isChecked())
                        {
                            aficiones +=chkDeportes.getText().toString();
                        }
                        else
                        {
                            if (chkViajar.isChecked())
                            {
                                aficiones +=chkViajar.getText().toString();
                            }
                        }
                    }
                }
                nombre = txtNombre.getText().toString();
                apellidos = txtApellidos.getText().toString();
                sexo = "";

                boolean sexoSeleccionado=false;
                if(rbMasculino.isChecked())
                {
                    sexoSeleccionado=true;
                    sexo =rbMasculino.getText().toString();
                }
                else
                {
                    if (rbFemenino.isChecked()) {
                        sexoSeleccionado=true;
                        sexo = rbFemenino.getText().toString();
                    } else {
                        Toast.makeText(getApplicationContext(), "Debes seleccionar un sexo", Toast.LENGTH_LONG).show();
                    }
                }

                boolean nombreApellidoVacios=false;
                if(nombre.equals("")||apellidos.equals(""))
                {
                    nombreApellidoVacios=true;
                    Toast.makeText(getApplicationContext(),"Debes introducir tu nombre o tu apellido",Toast.LENGTH_LONG).show();
                }
                if(sexoSeleccionado&&nombreApellidoVacios==false)
                {
                    Intent intent=new Intent(Ejercicio4.this,Ejercicio4Resultado.class);
                    intent.putExtra("nom", nombre);
                    intent.putExtra("ape", apellidos);
                    intent.putExtra("sexo", sexo);
                    intent.putExtra("aficiones", aficiones);
                    startActivity(intent);
                }



            }
        });


    }
}
