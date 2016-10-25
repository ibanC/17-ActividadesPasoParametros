package com.example.dm2.a17_actividadespasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad3 extends AppCompatActivity {

    private EditText num1,num2,num3;
    private int numRandom1;
    private int numRandom2;
    private TextView correctas,incorrectas;
    private int bien,mal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        num1=(EditText)findViewById(R.id.textnum1);
        num2=(EditText)findViewById(R.id.textnum2);
        correctas=(TextView)findViewById(R.id.correctas);
        incorrectas=(TextView)findViewById(R.id.incorrectas);
        bien=0;
        mal=0;
        correctas.setText(correctas.getText()+String.valueOf(bien));
        incorrectas.setText(incorrectas.getText()+String.valueOf(mal));
        numRandom1 = (int)((Math.random()*100)+1);
        num1.setText(numRandom1 +"");
        numRandom2 = (int)((Math.random()*100)+1);
        num2.setText(numRandom2 +"");

        num3=(EditText)findViewById(R.id.textnum3);
        //Toast.makeText(getApplicationContext(),numRandom1+"",Toast.LENGTH_LONG).show();
    }
    public void resultado(View v)
    {
        if(num3.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),"Tienes que introducir el resultado",Toast.LENGTH_LONG).show();
        }
        else
        {
            String resIntro=num3.getText().toString();
            Integer resIntroInt=Integer.parseInt(resIntro);
            int resultado=resIntroInt.intValue();
            int res=numRandom1+numRandom2;
            Intent intent=new Intent(Actividad3.this,Activity3Resultado.class);
            intent.putExtra("resultadoesperado",res);
            intent.putExtra("resultadointroducido",resultado);
            startActivityForResult(intent,1);

        }
    }
    public void onActivityResult (int requestCode,int resultCode,Intent data)
    {
        if(requestCode==1&&resultCode==RESULT_OK)
        {
            bien++;
            correctas.setText(getString(R.string.correctas)+String.valueOf(bien));
            numRandom1 = (int)((Math.random()*100)+1);
            num1.setText(numRandom1 +"");
            numRandom2 = (int)((Math.random()*100)+1);
            num2.setText(numRandom2 +"");
            num3.setText("");
        }
        else
        {
            mal++;
            incorrectas.setText(getString(R.string.incorrectas)+String.valueOf(mal));
        }
    }
}
