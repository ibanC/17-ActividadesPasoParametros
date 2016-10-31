package com.example.dm2.a17_actividadespasoparametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio4Resultado extends AppCompatActivity {

    private TextView lblnombre,lblapellidos,lblsexo,lblaficiones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4_resultado);

        Bundle extras=getIntent().getExtras();
        String nombre=extras.getString("nom");
        String apellidos=extras.getString("ape");
        String sexo=extras.getString("sexo");
        String aficiones=extras.getString("aficiones");

        lblnombre=(TextView)findViewById(R.id.nom);
        lblapellidos=(TextView)findViewById(R.id.ape);
        lblsexo=(TextView)findViewById(R.id.sex) ;
        lblaficiones=(TextView)findViewById(R.id.aficiones);

        if(aficiones.equals(""))
        {
            aficiones="No tienes ninguna aficion de las disponibles";
            lblaficiones.setText(aficiones);
        }
        else
        {
            aficiones="Tus aficiones son "+aficiones;
            lblaficiones.setText(aficiones);

        }

        lblnombre.setText(lblnombre.getText()+" "+nombre);
        lblapellidos.setText(lblapellidos.getText()+" "+apellidos);
        lblsexo.setText(lblsexo.getText()+" "+sexo);
        lblaficiones.setText(""+" "+aficiones);

    }

}
