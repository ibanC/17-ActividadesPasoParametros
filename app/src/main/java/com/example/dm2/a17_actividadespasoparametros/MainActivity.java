package com.example.dm2.a17_actividadespasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.but1);
        b2=(Button)findViewById(R.id.but2);
        b3=(Button)findViewById(R.id.but3);
        b4=(Button)findViewById(R.id.but4);
        salir=(Button)findViewById(R.id.salir);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void click(View v)
    {
        if(v.getId()==b1.getId())
        {
            Intent intent=new Intent(MainActivity.this,Actividad1.class);
            startActivity(intent);
        }
        else
        {
            if(v.getId()==b2.getId())
            {
                Intent intent=new Intent(MainActivity.this,Actividad2.class);
                startActivity(intent);
            }
            else
            {
                if(v.getId()==b3.getId())
                {
                    Intent intent=new Intent(MainActivity.this,Actividad3.class);
                    startActivity(intent);
                }
            }
        }
    }
}
