package com.example.dm2.a17_actividadespasoparametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2Comprobacion extends AppCompatActivity {

    private TextView lblRespuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2_comprobacion);

        lblRespuesta=(TextView)findViewById(R.id.lblComprobacion);

        Bundle extras=getIntent().getExtras();
        String usu=extras.getString("usuario");
        String con=extras.getString("contrasena");

        if(usu.equals("Iban")&&con.equals("1234"))
        {
            lblRespuesta.setText("El USUARIO y la PASSWORD son CORRECTAS");
        }
        else
        {
            lblRespuesta.setText("El USUARIO y la PASSWORD son INCORRECTAS");
        }
    }
    public void volver(View v)
    {
        finish();
    }
}
