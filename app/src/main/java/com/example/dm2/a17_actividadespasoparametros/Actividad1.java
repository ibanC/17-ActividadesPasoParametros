package com.example.dm2.a17_actividadespasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    private Button volver,verificar;
    private EditText e1,e2;
    String sNombre;
    private Intent intent;
    private String res;
    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad1);

        e1=(EditText)findViewById(R.id.editTextNombre);
        e2=(EditText)findViewById(R.id.editTextApellidos);

        t=(TextView)findViewById(R.id.aceptar);

        //sNombre=e1.getText().toString();


        verificar=(Button)findViewById(R.id.verificar);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sNombre=e1.getText().toString();
                String sApellidos=e2.getText().toString();
                intent= new Intent(Actividad1.this,AceptarCondiciones.class);
                intent.putExtra("Nombre",sNombre);
                intent.putExtra("Apellidos",sApellidos);
                startActivityForResult(intent,1);

            }
        });





        volver=(Button)findViewById(R.id.volver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    public void onActivityResult (int requestCode,int resultCode,Intent data)
    {
        if(requestCode==1&&resultCode==RESULT_OK)
        {
            res=data.getExtras().getString("respuesta");
            t.setText(getString(R.string.aceptar)+res);

        }
    }
}
