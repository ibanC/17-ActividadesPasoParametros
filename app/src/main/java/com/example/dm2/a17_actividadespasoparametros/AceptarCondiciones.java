package com.example.dm2.a17_actividadespasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AceptarCondiciones extends AppCompatActivity {

    private TextView datos;
    private Button butAceptar;
    private Button butRechazar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptar_condiciones);

        datos=(TextView)findViewById(R.id.usuario);
        butAceptar=(Button)findViewById(R.id.aceptar2);
        butRechazar=(Button)findViewById(R.id.rechazar);
        //recibir datos
        Bundle extras=getIntent().getExtras();
        String n=extras.getString("Nombre")+" "+extras.getString("Apellidos");


        //String a=extras.getString("Apellidos");
        datos.setText("Hola "+ n +" ¿Aceptas las condiciones?");

        Intent intent=new Intent();

    }
    public void AceptarRechazar(View v)
    {
        Intent intent=new Intent();
        if(v.getId()==butAceptar.getId())
        {
            intent.putExtra("respuesta","Aceptado");

        }
        else
        {
            intent.putExtra("respuesta","Rechazado");
        }
        setResult(RESULT_OK,intent);
        finish();
    }


}
