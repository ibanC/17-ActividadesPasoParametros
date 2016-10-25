package com.example.dm2.a17_actividadespasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity3Resultado extends AppCompatActivity {

    private TextView label;
    private boolean correcto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_resultado);

        label=(TextView)findViewById(R.id.lblresultado);
        Bundle extras=getIntent().getExtras();
        int resultadoEsperado=extras.getInt("resultadoesperado");
        int resultadoIntroducido=extras.getInt("resultadointroducido");


        correcto = false;
        if(resultadoEsperado==resultadoIntroducido)
        {
            correcto=true;
            label.setText("El resultado de la operacion es CORRECTA");

        }
        else
        {
            label.setText("El resultado de la operacion es INCORRECTA");

        }
    }
    public void volver(View v)
    {
        Intent intent=new Intent();
        if(correcto)
        {
            setResult(RESULT_OK,intent);
        }
        else
        {
            setResult(RESULT_CANCELED,intent);
        }
        finish();
    }
}
