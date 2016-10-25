package com.example.dm2.a17_actividadespasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {

    private Button boton;
    private EditText eUsu,eCon;
    private String usu="",con="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        eUsu=(EditText)findViewById(R.id.introUsuario);
        eCon=(EditText)findViewById(R.id.introContra);




        boton=(Button)findViewById(R.id.butSesion);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usu=eUsu.getText().toString();
                con=eCon.getText().toString();
                if(usu.equals("")||con.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"El usuario y la contraseña no pueden estar vacios",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent=new Intent(Actividad2.this,Actividad2Comprobacion.class);
                    intent.putExtra("usuario",usu);
                    intent.putExtra("contrasena",con);
                    startActivity(intent);
                }

            }
        });
    }
}
