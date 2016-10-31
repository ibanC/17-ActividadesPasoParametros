package com.example.dm2.a17_actividadespasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class Ejercicio5 extends AppCompatActivity {
    private EditText txtTienda;
    private CheckBox chkleche,chkpasta,chkpan,chkpescado;
    private String productos;
    private String tienda;
    private Button butConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);
        txtTienda=(EditText)findViewById(R.id.lugar);
        chkleche=(CheckBox) findViewById(R.id.chkleche);
        chkpan=(CheckBox)findViewById(R.id.chkpan);
        chkpescado=(CheckBox)findViewById(R.id.chkpescado);
        chkpasta=(CheckBox)findViewById(R.id.chkpasta);
        butConfirmar =(Button)findViewById(R.id.butConfirmar) ;

        butConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productos = "";
                if (chkleche.isChecked())
                {
                    productos +=chkleche.getText().toString()+" ";
                }
                if (chkpasta.isChecked())
                {
                    productos +=chkpasta.getText().toString()+" ";
                }

                if (chkpan.isChecked())
                {
                    productos +=chkpan.getText().toString()+" ";
                }
                if (chkpescado.isChecked())
                {
                    productos +=chkpescado.getText().toString()+" ";
                }


                tienda = txtTienda.getText().toString();



                if(tienda.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Debes introducir tu tienda",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(productos.equals(""))
                    {
                        Toast.makeText(getApplicationContext(),"Debes seleccionar un producto",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Intent intent=new Intent(Ejercicio5.this,Ejercicio5Resultado.class);
                        intent.putExtra("tienda", tienda);
                        intent.putExtra("productos", productos);
                        startActivity(intent);
                    }
                }




            }
        });

    }
}
