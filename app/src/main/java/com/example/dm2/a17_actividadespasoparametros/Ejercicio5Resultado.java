package com.example.dm2.a17_actividadespasoparametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio5Resultado extends AppCompatActivity {

    private TextView lbltienda;
    private TextView lblproductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5_resultado);

        Bundle extras=getIntent().getExtras();
        String tienda=extras.getString("tienda");
        String productos=extras.getString("productos");


        lbltienda =(TextView)findViewById(R.id.tien);
        lblproductos =(TextView)findViewById(R.id.pro);

        lbltienda.setText(lbltienda.getText()+" "+tienda);
        lblproductos.setText(lblproductos.getText()+" "+productos);

    }
}
